package Ds_2017;

public class Joueur extends Acteur {
    private String club;

    public Joueur(String nom, String prenom, int age, double montant, String club) {
        super(nom, prenom, age, montant);
        this.club = club;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

}
