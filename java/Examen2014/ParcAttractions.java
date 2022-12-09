package Examen2014;

public class ParcAttractions {
    Attractions lesAttractions[];
    private int nb_attractions = 0;
    private String nom;
    private int taille;

    public ParcAttractions(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.lesAttractions = new Attractions[taille];
    }

    void ajouteAttraction(Attractions a) {
        if (this.taille == this.nb_attractions) {
            System.out.println("tableau complet");
        } else {
            lesAttractions[this.nb_attractions] = a;
            this.nb_attractions++;
        }
    }

    float getrecette() {
        int sum = 0;
        for (int i = 0; i < this.nb_attractions; i++) {
            sum += lesAttractions[i].recette;
        }
        return sum;
    }

    void affiche() {
        System.out.println("nom de l'attraction");
        System.out.println(this.nom);
        for (int i = 0; i < this.nb_attractions; i++) {

            System.out.println(lesAttractions[i].affiche());
        }
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
