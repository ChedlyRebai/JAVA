package Test;

public class Cadre extends Employee {
    private String grade;
    private float prime;

    public Cadre(String nom, String prenom, int numerotlf, String grade, float prime) {
        super(nom, prenom, numerotlf);
        this.grade = grade;
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString() + " grade:" + this.grade + " prime:" + this.prime;
    }

    @Override

    public float CalculSalaire() {
        return 5 * this.smig + this.prime;
    }

}
