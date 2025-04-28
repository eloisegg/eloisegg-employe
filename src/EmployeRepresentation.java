public class EmployeRepresentation extends Employe{
    private double chiffreAffaire;

    public EmployeRepresentation(String prenom, String nom, int age, double chiffreAffaire){
        super(prenom, nom, age);
        this.chiffreAffaire=chiffreAffaire;
    }

    public double calculSalaire(){
        return 0.25*chiffreAffaire;
    }

    public String toSring(){
        return "Representation :" + super.toString() + "\nSalaire : " + calculSalaire();
    }

    public double getChiffreAffaire(){
        return chiffreAffaire;
    }
    public void setChiffreAffaire(double chiffreAffaire){
        this.chiffreAffaire = chiffreAffaire;
    }
}
