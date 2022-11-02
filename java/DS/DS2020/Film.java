package DS.DS2020;

import java.util.Scanner;

public class Film {
    protected String titre;
    protected String realisateur;
    protected String pays;
    protected int duree;
    protected int nbplace;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

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
        return this.titre + " de " + this.realisateur + " (" + this.pays + ")" + " - " + this.duree + "min";
    }

}
