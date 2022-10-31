package DS.DS2020_1;

public class Vetement {
    private String code;
    private String libelle;
    private String couleur;
    private float prixHT;
    private int quantité;
    private final int TVA = 18;

    public Vetement(String lib, Float d, String code, String c) {
        this.code = code;
        this.libelle = lib;
        this.prixHT = d;
        this.couleur = c;
    }

    @Override
    public String toString() {
        return this.code + " " + this.libelle + " " + this.couleur + " :prixHT=" + this.prixHT + " et qté="
                + this.quantité;
    }

    public float prixTTC() {
        return this.prixHT * (1 + this.TVA / 100);
    }

    public float prixTTC(int remise) {
        return this.prixTTC() * (1 - remise / 100);
    }

}
