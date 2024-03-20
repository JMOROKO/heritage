package exercice7;

public class GestionPaiementApp {
    public static void main(String[] args) {
        CarteCredit carte1 = new CarteCredit();
        PayPal payPal = new PayPal();
        Commande commande1 = new Commande(1000, carte1);
        Commande commande2 = new Commande(1000, payPal);
        Commande commande3 = new Commande(-1000, payPal);
        commande1.processPayment();
        commande2.processPayment();
        commande3.processPayment();
    }
}
