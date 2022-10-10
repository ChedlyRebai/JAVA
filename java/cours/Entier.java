public class Entier {
    private int n; // valeur de l&#39;entier
    private int dn;

    private Entier(int e) {
        e = n;
    }

    public void incrementer(int dn) {
        this.n += dn;
    }

    public void afficher() {
        System.out.println(this.dn);
    }
}