package exercice4;

public class Manager extends Employe{
    private String service;

    public Manager() {
    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        this.salaire = this.getSalaire()+ (this.getSalaire() * 20/100);
        return this.salaire;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "service='" + service + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
