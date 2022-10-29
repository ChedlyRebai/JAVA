package DS.DS2020;

public class Film {
    private String titre;
    private String realisateur;
    private String pays;
    private int duree;
    private int nbplace;

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

    }

    @Override
    public String toString() {
        return "Film [titre=" + titre + ", realisateur=" + realisateur + ", pays=" + pays + "]";
    }

}
