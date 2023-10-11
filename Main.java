public class Main {
    public static void main(String[] args) {
        Couple<String, Integer> couple = new Couple<>("clé", 42);
    
        System.out.println("Clé : " + couple.getCle());
        System.out.println("Valeur : " + couple.getValeur());
    
        couple.setValeur(100);
        System.out.println("Nouvelle valeur : " + couple.getValeur());
    }
    
    
}
