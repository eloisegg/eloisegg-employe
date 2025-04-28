public class EmployeVente extends Employe{
    private double chiffreAffaire;
    private double vat;

    public EmployeVente(String prenom, String nom, int age, double chiffreAffaire){
        super(prenom, nom, age);
        this.chiffreAffaire=chiffreAffaire;
    }

    public double calculSalaire(){
        return 0.2*chiffreAffaire;
    }

    public String toSring(){
        return "Vente :" + super.toString() + "\nSalaire : " + calculSalaire();
    }

    public double getChiffreAffaire(){
        return chiffreAffaire;
    }
    public void setChiffreAffaire(double chiffreAffaire){
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
}
