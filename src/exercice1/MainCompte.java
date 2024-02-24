package exercice1;

public class MainCompte {
    public static void main(String[] args) {
        Compte compte = new Compte();
        compte.deposer(500);
        System.out.println(compte.afficherCompteInfo());
        compte.deposer(500);
        System.out.println(compte.afficherCompteInfo());
        compte.deposer(2500);
        System.out.println(compte.afficherCompteInfo());
        compte.retirer(3000);
        System.out.println(compte.afficherCompteInfo());
        compte.retirer(5000);
        System.out.println(compte.afficherCompteInfo());
        Compte compte2 = new Compte();
        System.out.println("Nombre de compte créé : "+Compte.afficherNbComptes());
    }
}
