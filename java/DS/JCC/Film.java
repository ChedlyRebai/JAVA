package DS.JCC;

import java.util.Scanner;

public class Film {
    protected String titre, realisateur, pays;
    protected int nbplace, duree;

    public int getNbplace() {
        return nbplace;
    }

    public void setNbplace(int nbplace) {
        this.nbplace = nbplace;
    }

    public Film(String titre, String r, String pays, int d) {
        this.titre = titre;
        this.realisateur = r;
        this.pays = pays;
        this.duree = d;
    }

    public float totalVenteBillets() {
        System.out.println("places pour l'etudiants");
        Scanner in = new Scanner(System.in);
        int nbEtudiants = in.nextInt();
        return nbEtudiants * 2 + (this.nbplace - nbEtudiants) * 3;
    }

    @Override
    public String toString() {
        return this.titre + " de " + this.realisateur
                + " (" + this.pays + ")" + " - " + this.duree + "min";
    }

}
