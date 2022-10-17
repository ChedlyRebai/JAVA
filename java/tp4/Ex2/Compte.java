package tp4.Ex2;

public class Compte {
    public int numero = 0;
    private static int compteur = 0;
    private float solde = 0;

    public void deposer(float m) {
        this.solde += m;
    }

    public void retirer(float m) {
        this.solde -= m;
    }

    public float avoirsolde() {
        return this.solde;
    }

    public void transfere(float m, Compte c) {
        this.solde -= m;
        c.deposer(m);
    }

    public Compte() {
        compteur++;
        this.numero = compteur;
    }

    public float getsolde() {
        return this.solde;
    }
}
