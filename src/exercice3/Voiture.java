package exercice3;

public class Voiture extends Vehicule{
    private String modele;
    private int annee;

    @Override
    public void emettreSon(){
        System.out.println("La voiture vrombit.");
    }

    public Voiture() {
    }
    public Voiture(String modele, int annee) {
        this.modele = modele;
        this.annee = annee;
    }

    public Voiture(String nom, double prix, String modele, int annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }


    public String afficherInformations() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", annee=" + annee +
                '}';
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
