public class Test {

    public static void main(String[] args) {
        Employe emp1 = new EmployeVente("Lucas", "NNN", 19, 6527);
        Employe emp2 = new EmployeRepresentation("Eloise", "HHH", 20, 9000);
        Employe emp3 = new EmployeProduction("Bilal", "PPP", 20, 8);
        Employe emp4 = new EmployeManutention("Tim", "LLL", 19, 10);
        Employe emp5 = new EmployeProductionARisque("Lorenzo", "TTT", 19, 20);
        Employe emp6 = new EmployeManutentionARisque("Esteban", "DDD", 21, 13);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println(emp5.toString());
        System.out.println(emp6.toString());

        Personnel p = new Personnel();
        p.ajouterEmploye(emp1);
        p.ajouterEmploye(emp2);
        p.ajouterEmploye(emp3);
        p.ajouterEmploye(emp4);
        p.ajouterEmploye(emp5);
        p.ajouterEmploye(emp6);

        p.calculerSalaires();

        System.out.println("\nSalaire moyen : ");
        System.out.println(p.salaireMoyen());
    }
}
