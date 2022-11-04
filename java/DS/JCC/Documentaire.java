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
        return super.toString() + " sujet:" + this.sujet;
    }

    @Override
    public float totalVenteBillets() {
        return super.nbplace * 2;
    }
}
