package DS.JCC;

public class Jcc {
    private Film[] competition;
    private int annee;
    private final int maximum = 30;
    private int nbf = 0;
    // private int index = 0;

    Jcc(int taille, int annee) {
        if (taille <= this.maximum) {
            competition = new Film[taille];

        }
        if (taille > this.maximum) {
            System.out.println("taille est plus grand");
        }
        this.annee = annee;
    }

    public void ajout(Film f) {
        if (this.nbf == this.competition.length) {
            System.out.println("La compétition est au complet ");
        } else {
            competition[this.nbf] = f;
            this.nbf++;
        }
    }

    public void lister() {
        for (int i = 0; i < this.nbf; i++) {
            // if ((competition[i].getClass().getSimpleName()).equals("Film")) {

            System.out.println(competition[i].toString());
        }
    }

    public float totalVenteBillets() {
        float somme = 0;
        for (int i = 0; i < this.nbf; i++) {
            somme += competition[i].totalVenteBillets();
        }
        return somme;
    }

    public static void main(String[] args) {
        Jcc list = new Jcc(2, 2002);

        Film film1 = new Documentaire("le dernier refuge", "oussman", "mali", 86, "la guerre civile");
        film1.setNbplace(30);
        Film film2 = new Film("insurrection", "jilani saadi", "tunisie", 105);
        film2.setNbplace(45);
        list.ajout(film2);
        list.ajout(film1);
        list.lister();

    }
}
