package exercice3;

public class Vehicule {
    private String nom;
    private double prix;

    public void emettreSon(){
        System.out.println("le vehicule emet un son inconnu");
    }

    public String afficherInformations() {
        return "Vehicule{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }

    public Vehicule() {
    }

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
}
