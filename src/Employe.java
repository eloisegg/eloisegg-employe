abstract class Employe {
    private String prenom;
    private String nom;
    private int age;
    // This is an email address
    private String email;
    private String address;

    public Employe(String prenom, String nom, int age){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    public abstract double calculSalaire();

    public String toString(){
        return "\nPrenom : " + this.prenom + "\nNom : " + this.nom + "\nAge : " + this.age + " ans";
    }

    public int getAge() {
        return age;
    }
     public void setAge(int age){
        this.age = age;
     }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
