package exercice6;

public class DVD implements Empruntable{
    private String titre;
    private String realisateur;
    private boolean statut;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
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
        return "DVD{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", statut=" + statut +
                '}';
    }
}
