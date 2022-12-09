package Examen2014;

public class Attractions {
    private String nom;
    private Float cout;
    private ConditionAge Conditionage;
    private int nbper = 0;
    float recette = 0;

    public Attractions(String nom, Float cout, int nbper, float recette) {
        this.nom = nom;
        this.cout = cout;
        this.nbper = nbper;
        this.recette = recette;
    }

    public String affiche() {
        return "Attractions [nom=" + this.nom + ", cout=" + this.cout + ", nbper=" + this.nbper + ", recette="
                + this.recette + "]";
    }

    public void utilise(Personne p) throws AccesInterditException {
        if (!Conditionage.accesPossible(p)) {
            throw new AccesInterditException("error");
        } else {
            this.nbper++;
            this.recette += this.cout;
        }
    }

}
