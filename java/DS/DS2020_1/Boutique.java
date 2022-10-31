package DS.DS2020_1;

public class Boutique {
    Vetement[] tabvet;
    private String nom;
    private int nbVet = 0;
    private int index = 0;

    Boutique(String n, int taille) {
        this.nom = n;
        this.tabvet = new Vetement[taille];
        this.nbVet = taille;
    }

    public void ajoutVetement(Vetement v) {
        if (nbVet == index) {
            System.out.println("tableau complet");
        } else {
            tabvet[index] = v;
            index++;
        }
    }

    public void afficheStock(int remise) {
        for (int i = 0; i < this.index; i++) {
            System.out.print(tabvet[i].toString() + " prix:" + tabvet[i].prixTTC(remise) + "\n");
        }
    }

    public static void main(String[] args) {

        Boutique listv = new Boutique(null, 2);
        VetementEnfant v1 = new VetementEnfant("Robe", 29.900f, "R100", "rouge");
        v1.setAge(0.5);
        Vetement v2 = new Vetement("Manteau", 169.900f, "M200", "gris");
        listv.ajoutVetement(v1);
        listv.ajoutVetement(v2);
        listv.afficheStock(1);

    }
}
