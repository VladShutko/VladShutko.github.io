import java.util.Collection;
import java.util.List;

public class ComptagePropriete<T> {
    // Méthode qui prend en argument une collection générique et un verificateur
    // de type T
    public static <T> int compterElementsAvecPropriete(Collection<T> collection, VerificateurPropriete<T> verificateur) {
        int count = 0;
        // On parcourt la collection et on utilise le "verifier" pour voir si
        // l'élément de la collection satisfait la propriété, si oui alors on incrémente le compteur 
        for (T element : collection) {
            if (verificateur.verifier(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Collection<String> collectionDeChaines = List.of("chaine", "abcd", "javac", "programmation", "générique");

        int nombreDeChainesImpaires = compterElementsAvecPropriete(collectionDeChaines, s -> s.length() % 2 != 0);
        System.out.println("Nombre de chaînes de caractères avec une longueur impaire : " + nombreDeChainesImpaires);
    }
}

// Interface fonctionelle définissant une méthode "verifier" et renvoie un booleen
// en fonction de la propriété souhaitée.
interface VerificateurPropriete<T> {
    boolean verifier(T t);
}
