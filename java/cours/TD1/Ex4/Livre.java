package cours.TD1.Ex4;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    public Livre(String titre, String auteur) {

        this.auteur = auteur;
        this.titre = titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public float getPages() {
        return this.nbPages;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setPages(int number) {
        this.nbPages = number;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(int nb) {
        if (nb > 20) {
            this.nbPages = nb;
        } else {
            System.out.println("le nombre indiqué est faible.");
        }
    }

    public String toString() {
        return "Livre intitulé " + this.titre + " de " + this.auteur + ", contenant " + this.nbPages + " pages.";
    }

    public void decrire() {
        System.out.println(this.toString());
    }

    public Livre() {
        this.nbPages = 0;
    }

    public Livre(String titre, int nbPages) {
        this.titre = titre;
        this.nbPages = nbPages;
    }

    public Livre(String titre, String auteur, int nbPages) {

        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = auteur;
    }

    // EX1
    public void setPrix(double prix) {
        if (this.prixFixe == false) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.out.println("desole le prix est fixé");
        }
    }

    public double getPrix() {
        return this.prix;
    }

    // EX3
    public Livre(String titre, String auteur, int nbPages, double prix) {
        this(titre, auteur, nbPages);
        this.prix = prix;
    }

    // EX4
    public boolean testPrix() {
        return this.prix != 0.0;
    }

}
