package Ds_2017;

public class Acteur {
    protected String nom, prenom;
    protected int age;
    protected double Montant;

    public double getSalaire() {
        return this.Montant;
    }

    public Acteur(String nom, String prenom, int age, double montant) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.Montant = montant;
    }

    @Override
    public String toString() {
        return "Acteur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", Montant=" + Montant + "]";
    }

}
