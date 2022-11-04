package DS.JCC;

public class Jcc {
    Film[] competition;
    int annee;
    final int maximum = 30;
    int nbf = 0;
    int index = 0;

    Jcc(int taille, int annee) {
        competition = new Film[taille];
        this.annee = annee;
        this.nbf = taille;
    }

    public void ajout(Film f) {
        if (index == nbf) {
            System.out.println("La compétition est au complet ");
        } else {
            competition[index] = f;
            index++;
        }
    }

    public void lister() {
        for (int i = 0; i < index; i++) {
            // if ((competition[i].getClass().getSimpleName()).equals("Film")) {

            System.out.println(competition[i].toString());
        }
    }

    public float totalVenteBillets() {
        float somme = 0;
        for (int i = 0; i < index; i++) {
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
