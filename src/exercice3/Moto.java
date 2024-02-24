package exercice3;

public class Moto extends Vehicule {
    private String marque;
    private String puissance;

    @Override
    public void emettreSon(){
        System.out.println("La moto rugit.");
    }

    public String afficherInformations() {
        return "Moto{" +
                "marque='" + marque + '\'' +
                ", puissance='" + puissance + '\'' +
                '}';
    }
    public Moto() {
    }
    public Moto(String marque, String puissance) {
        this.marque = marque;
        this.puissance = puissance;
    }
    public Moto(String nom, double prix, String marque, String puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }
}
