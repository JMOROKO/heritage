package exercice5;

public class Main {
    public static void main(String[] args) {
        Figure cercle1 = new Cercle("Bafing", 10);
        System.out.println(cercle1.afficherDetails());

        Figure cercle2 = new Cercle("Moyen comoé", 17);
        System.out.println(cercle1.afficherDetails());

        Figure rectangle1 = new Rectangle("Morison", 15, 4);
        System.out.println(rectangle1.afficherDetails());

        Figure rectangle2 = new Rectangle("Morison platsa", 15, 4);
        System.out.println(rectangle2.afficherDetails());
    }
}
