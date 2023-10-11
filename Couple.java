public class Couple<K, V> {
    //On défini 2 paramètres génériques
    //On défini avec "final" pour qu'elle ne puisse être modifiée dans le constructeur
    private final K cle;
    private V valeur;

    //initialisation de la clé et de la valeur dans le constructeur
    public Couple(K cle, V valeur) {
        this.cle = cle;
        this.valeur = valeur;
    }

    //Méthodes pour accéder à la clé et à la valeur
    public K getCle() {
        return cle;
    }

    public V getValeur() {
        return valeur;
    }

    //Méthode qui permet de modifier la valeur
    public void setValeur(V nouvelleValeur) {
        this.valeur = nouvelleValeur;
    }
}


