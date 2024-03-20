package exercice5;

public class Cercle extends Figure{
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        double result = Math.PI * Math.pow(this.rayon, 2);
        return result;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public String afficherDetails() {
        return "Cercle{" +
                "rayon=" + rayon +
                "\nAire=" + calculerAire() +
                "\nPerimetre=" + calculerPerimetre() +
                '}';
    }

}
