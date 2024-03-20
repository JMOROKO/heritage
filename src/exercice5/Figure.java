package exercice5;

public abstract class Figure {
    private String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public abstract double calculerAire();
    public abstract double calculerPerimetre();
    public abstract String afficherDetails();
}
