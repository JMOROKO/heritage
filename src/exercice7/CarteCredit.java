package exercice7;

public class CarteCredit  extends Paiement{
    public void effectuerPaiement(double montant){
        if(montant<0){
            System.out.println("Paiement par carte de crédit refusé");
            return;
        }
        System.out.println("Paiement par carte de crédit approuvé");
    }
}
