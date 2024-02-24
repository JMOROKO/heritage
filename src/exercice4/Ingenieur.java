package exercice4;

public class Ingenieur extends Employe{
    private String specialite;
    public Ingenieur() {
    }
    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }
    @Override
    public double calculerSalaire() {
        this.salaire = this.getSalaire()+ (this.getSalaire() * 15/100);
        return this.salaire;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                "specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
