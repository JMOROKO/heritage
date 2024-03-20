package exercice7;

public class PayPal extends Paiement{
    public void effectuerPaiement(double montant){
        if(montant<0){
            System.out.println("Paiement par PayPal refusé");
            return;
        }
        System.out.println("Paiement par PayPal approuvé");
    }
}
