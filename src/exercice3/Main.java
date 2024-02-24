package exercice3;

public class Main {
    public static void main(String[] args) {
        Voiture voiture=new Voiture("BMW", 200000, "X3", 2021);
        Moto moto=new Moto("BMW", 120000, "C1", "200");
        Avion avion=new Avion("BOWING", 120000, "Air ivoire", 500);


        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        System.out.println(voiture.afficherInformations());
        System.out.println(moto.afficherInformations());
        System.out.println(avion.afficherInformations());
    }
}