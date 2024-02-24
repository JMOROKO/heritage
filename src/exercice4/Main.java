package exercice4;

public class Main {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("MOHAMED", "ALI", "ali.mohamed@gmail.com", "0022145477884", 50000, "Ingénieur logiciel");
        Manager manager = new Manager("KONE", "ALO", "alo@gmail.com", "0021245544778", 20000, "Video surveillance");
        System.out.println(ingenieur.calculerSalaire());;
        System.out.println(manager.calculerSalaire());;
        System.out.println(ingenieur);
        System.out.println(manager);
    }
}