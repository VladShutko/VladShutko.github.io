import java.util.List;

public class Intervalle {
    //Méthode prenant une liste générique en argument + un début et une fin
    //Interface "Comparable" implémentée afin que les éléments puissent être comparés entre eux;
    public static <T extends Comparable<T>> T trouverMaximumDansIntervalle(List<T> liste, int debut, int fin) {
        if (liste == null || liste.isEmpty() || debut < 0 || debut >= liste.size() || fin < 0 || fin >= liste.size() || debut > fin) {
            throw new IllegalArgumentException("Arguments invalides");
        }
        //Le premier élément de la liste générique devient le maximum
        T maximum = liste.get(debut);

        // On parcourt la liste et si l'élément est + grand que le maximum actuel, on le remplace
        for (int i = debut + 1; i <= fin; i++) {
            T element = liste.get(i);
            if (element.compareTo(maximum) > 0) {
                maximum = element;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        List<Integer> liste = List.of(10, 5, 20, 15, 30, 25, 35);

        int debut = 1;
        int fin = 6;

        Integer maximum = trouverMaximumDansIntervalle(liste, debut, fin);
        System.out.println("Maximum dans l'intervalle [" + debut + ", " + fin + "] : " + maximum);
    }
}
