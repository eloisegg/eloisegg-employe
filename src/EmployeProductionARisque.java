public class EmployeProductionARisque extends EmployeProduction{

    public EmployeProductionARisque(String prenom, String nom, int age, int nombreUnites){
        super(prenom,nom,age,nombreUnites);
    }

    @Override
    public double calculSalaire() {
        return super.calculSalaire() + 100;
    }

    public String toString(){
        return super.toString();
    }
}
