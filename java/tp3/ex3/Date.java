package tp3.ex3;

public class Date {
    public int jour, mois, annee;

    public Date(int j, int m, int a) {
        this.jour = j;
        this.mois = m;
        this.annee = a;
    }

    public int getjour() {
        return this.jour;
    }

    public int getmois() {
        return this.mois;
    }

    public int getannee() {
        return this.annee;
    }
}
