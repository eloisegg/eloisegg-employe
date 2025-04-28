import java.util.ArrayList;

public class Personnel {
    private ArrayList<Employe> employes = new ArrayList<Employe>();

    // Constructeurs
    public Personnel(ArrayList<Employe> employes){
        this.employes = employes;
    }

    public Personnel(){
        this.employes = new ArrayList<Employe>();
    }

    // Methodes
    public void ajouterEmploye(Employe e){
        employes.add(e);
    }

    public void calculerSalaires(){
        System.out.println("\nTous les salaires :");
        for (Employe e: employes){
            System.out.println(e.calculSalaire());
        }
    }

    public double salaireMoyen(){
        double somme = 0;
        int n = 0;
        for (Employe e: employes){
            somme+=e.calculSalaire();
            n++;
        }
        return somme/n;
    }

}

