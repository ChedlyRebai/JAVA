package Test;

public class Ovrier extends Employee {
    private int nbheure;
    private Cadre manager;

    public Ovrier(String nom, String prenom, int numerotlf, int nbheure, Cadre manager) {
        super(nom, prenom, numerotlf);
        this.nbheure = nbheure;
        this.manager = manager;
        // matricule++;
    }

    public Cadre getManager() {
        return this.manager;
    }

    @Override
    public String toString() {
        return super.toString() + " nbheure:" + this.nbheure;
    }

    @Override
    public float CalculSalaire() {
        return 3 * this.nbheure;
    }

}
