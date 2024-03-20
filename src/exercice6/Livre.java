package exercice6;

public class Livre implements Empruntable{
    private String titre;
    private String auteur;
    private boolean statut;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.statut = false;
    }

    @Override
    public void emprunter() {
        this.statut = true;
    }

    @Override
    public void retourner() {
        this.statut = false;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", statut=" + statut +
                '}';
    }
}
