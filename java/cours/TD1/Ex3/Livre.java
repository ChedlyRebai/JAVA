package cours.TD1.Ex3;

public class Livre {
    private String titre, auteur;
    private float nbPages;

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    // EX1
    public String getAuteur() {
        return this.auteur;
    }

    public float getPages() {
        return this.nbPages;
    }

    public String getTitre() {
        return this.titre;
    }

    // EX2
    public void setPages(float number) {
        this.nbPages = number;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // EX3
    public void setNbPages(int nb) {
        if (nb > 20) {
            this.nbPages = nb;
        } else {
            System.out.println("le nombre indiqué est faible.");
        }
    }

    // EX4
    public String toString() {
        return "Livre intitulé " + this.titre + " de " + this.auteur + ", contenant " + this.nbPages + " pages.";
    }

    // EX5
    public void decrire() {
        System.out.println(this.toString());
    }

    // EX6
    public Livre() {
        this.nbPages = 0;
    }

    public Livre(String titre, int nbPages) {

    }
}