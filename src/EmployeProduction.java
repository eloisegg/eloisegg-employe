public class EmployeProduction extends Employe{
    private int nombreUnites;

    public EmployeProduction(String prenom, String nom, int age, int nombreUnites){
        super(prenom, nom, age);
        this.nombreUnites = nombreUnites;
    }

    public double calculSalaire(){
        return 5*nombreUnites;
    }

    public String toSring(){
        return "Production :" + super.toString() + "\nSalaire : " + calculSalaire();
    }

    public double getNombreUnites(){
        return nombreUnites;
    }
    public void setNombreUnites(int nombreUnites){
        this.nombreUnites = nombreUnites;
    }
}
