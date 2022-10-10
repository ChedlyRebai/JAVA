package cours.TD1.Ex2;

public class Livre {
    private String titre, auteur;
    private float nbPages;

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setNbPages(int nb) {
        this.nbPages = nb;
    }
}