package exercice6;

public class GestionBibliotheque {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Topé l'areigné", "Test");
        Livre livre2 = new Livre("Topé", "Test 2");

        DVD dvd1 = new DVD("Piège en haute mer", "JMO");
        DVD dvd2 = new DVD("NIKO", "arnold");

        Utilisateur utilisateur = new Utilisateur("KOFFI");

        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(livre2);
        livre2.retourner();

        utilisateur.emprunterObjet(dvd1);

        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(dvd1);
        System.out.println(dvd2);
    }
}
