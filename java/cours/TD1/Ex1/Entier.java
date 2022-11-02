package cours.TD1.Ex1;

public class Entier {
    private int n; // valeur de l&#39;entier

    Entier(int e) {
        this.n = e;
    }

    public void incrementer(int dn) {
        this.n += dn;
    }

    public void afficher() {
        System.out.println(this.n);
    }

    public int getN() {
        return this.n;
    }
}