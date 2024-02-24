package exercice2;

public class GestionLivre {
    //Livre(int ISBN, String titre, Auteur auteur)
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Moroko", "Jean-romaric", "morokojeanr@hotmail.com", "002250748708129",30, "11155565");
        Auteur auteur = new Auteur("KOFFI", "KOUAME", "koffi@gmail.com", "002250745588774", 45, "154522255");
        Livre livre = new Livre(11111125, "Mon esprit", auteur);

        System.out.println(adherent);
        System.out.println(livre);
    }
}
