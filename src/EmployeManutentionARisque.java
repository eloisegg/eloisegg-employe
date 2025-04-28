public class EmployeManutentionARisque extends EmployeManutention{

    public EmployeManutentionARisque(String prenom, String nom, int age, double heuresTravail){
        super(prenom,nom,age,heuresTravail);
    }

    @Override
    public double calculSalaire() {
        return super.calculSalaire() + 100;
    }

    public String toString(){
        return super.toString();
    }
}
