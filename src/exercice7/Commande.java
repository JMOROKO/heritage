package exercice7;

public class Commande {
    private double montant;
    private Paiement paiement;

    public Commande(double montant, Paiement paiement) {
        this.montant = montant;
        this.paiement = paiement;
    }

    public void processPayment(){
        paiement.effectuerPaiement(montant);
    }
}
