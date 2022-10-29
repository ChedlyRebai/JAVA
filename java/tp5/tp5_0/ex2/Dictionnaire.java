package tp5.tp5_0.ex2;

import tp5.tp5_0.ex1.Motdico;

public class Dictionnaire {
    private int nbmots = 0;
    private int index = 0;
    Motdico[] dico;
    private String nom;

    public void getnom() {
        System.out.println(this.nom);
    }

    public void print(int i) {
        System.out.println(dico[i].getMot());
        System.out.println(dico[i].getDefinitions());
    }

    public Dictionnaire(String nom, int nbm) {
        this.nom = nom;
        dico = new Motdico[nbm];
        this.nbmots = nbm;
    }

    public void ajoutermot(Motdico m) {
        if (this.index == this.nbmots) {
            System.out.println("table is full");
        } else {
            // dico[index].setMot(m.getMot());
            // dico[index].setDefinitions(m.getDefinitions());
            dico[index] = m;
            index++;
        }
    }

    public void supprimermot(String ch) {
        for (int i = 0; i < index; i++) {
            if ((dico[i].getMot()).equals(ch)) {
                index--;
                for (int j = i; j < index; j++) {
                    dico[j] = dico[j +1];  
                }
            }
        }

    }

    public void toString(Motdico m) {
        System.out.println("mot:" + m.getMot() + "\n Definitions: " + m.getDefinitions());
    }

    public void listerdico() {
        for (int i = 0; i < index; i++) {
            toString(dico[i]);
        }
    }

    public int cherchermot(String ch) {
        for (int i = 0; i < index; i++) {
            if (dico[i].getMot().equals(ch)) {
                return i;
            }
        }
        return -1;
    }

    public int nbsysnonymes(Motdico m) {
        int nb = 0;
        for (int i = 0; i < index; i++) {
            if (dico[i].synonyme(m)) {
                nb++;
            }
        }
        return nb;
    }
}
