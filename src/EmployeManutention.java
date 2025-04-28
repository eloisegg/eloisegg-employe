public class EmployeManutention extends Employe{
    private double heuresTravail;

    public EmployeManutention(String prenom, String nom, int age, double heuresTravail){
        super(prenom, nom, age);
        this. heuresTravail= heuresTravail;
    }

    public double calculSalaire(){
        return 20*heuresTravail;
    }

    public String toSring(){
        return "Manutention :" + super.toString() + "\nSalaire : " + calculSalaire();
    }

    public double getHeuresTravail(){
        return heuresTravail;
    }
    public void setHeuresTravail(double heuresTravail){
        this.heuresTravail =heuresTravail;
    }
}
