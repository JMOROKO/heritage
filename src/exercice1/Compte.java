package exercice1;

public class Compte {
    private String numero;
    private double solde;
    private static int nbCompte;

    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbCompte++;
    }

    public void deposer(double montant){
        if(montant < 0){
            System.out.println("Vous ne pouvez pas déposer un montant négatif");
            return;
        }
        this.solde += montant;
    }
    public void retirer(double montant){
        if(this.solde > montant){
            this.solde -= montant;
        }else{
            System.out.println("Votre solde est insuffisant pour effectuer cette opération.");
        }
    }

    public String afficherCompteInfo() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }
    public static int afficherNbComptes(){
        return nbCompte;
    }
    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
