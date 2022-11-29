package Test;

public class Employee {
    public int matricule;
    public static int counter = 100;
    protected String nom, prenom;
    protected int numerotlf;
    protected final int smig = 300;

    public int getMatricule() {
        return this.matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumerotlf() {
        return this.numerotlf;
    }

    public void setNumerotlf(int nomtlf) {
        this.numerotlf = nomtlf;
    }

    public int getSmig() {
        return smig;
    }

    @Override
    public String toString() {
        return "\n" + matricule + " " + this.nom + " " + this.prenom + " " + this.numerotlf;
    }

    public Employee(String nom, String prenom, int numerotlf) {
        this.nom = nom;
        this.matricule = counter;
        this.prenom = prenom;
        this.numerotlf = numerotlf;
        counter++;
    }

    public float CalculSalaire() {
        return this.smig;
    }

}
