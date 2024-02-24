package exercice2;

public class Adherent extends Personne{
    private String numAdherent;

    public Adherent(String nom, String prenom, String email, String tel, int age, String numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "numAdherent='" + numAdherent + '\'' +
                '}';
    }
}
