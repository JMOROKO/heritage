package exercice2;

public class Auteur extends Personne{
    private String numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, String numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "numAuteur='" + numAuteur + '\'' +
                '}';
    }
}
