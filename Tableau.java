public class Tableau {
    //Méthode servant à parcourir les éléments du tableau et à afficher les éléments qu'il contient
    public static <T> void afficherTableau(T[] tableau) {
        for (T element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //Méthode qui prends en compte le tableau et 2 éléments 
    //Va vérifier si les 2 éléments sont valides et va procéder à l'échange
    public static <T> void echangerElements(T[] tableau, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= tableau.length || indice2 < 0 || indice2 >= tableau.length) {
            System.out.println("Indices invalides. L'échange n'a pas été effectué.");
        } else {
            T temp = tableau[indice1];
            tableau[indice1] = tableau[indice2];
            tableau[indice2] = temp;
        }
    }

    //Exemple permettant d'interchanger 2 elements d'un tableau
    public static void main(String[] args) {
        Integer[] tableau = { 1, 2, 3, 4, 5 };

        System.out.println("Tableau original :");
        afficherTableau(tableau);

        echangerElements(tableau, 0, 2);
        System.out.println("Tableau après l'échange :");
        afficherTableau(tableau);
    }

}
