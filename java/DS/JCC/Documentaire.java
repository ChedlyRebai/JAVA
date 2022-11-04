package DS.JCC;

public class Documentaire extends Film {
    private String sujet;
    private float tarif = 2;

    public Documentaire(String titre, String r, String pays, int d, String sujet) {
        super(titre, r, pays, d);
        this.sujet = sujet;
    }

    @Override
    public String toString() {
        return this.titre + " de " + this.realisateur + " (" + this.pays + ")" + " - " +
                this.duree + "min sujet:" + this.sujet;
    }

    @Override
    public float totalVenteBillets() {
        return super.nbplace * 2;
    }
}
