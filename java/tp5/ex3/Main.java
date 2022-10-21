package tp5.ex3;

import java.util.Dictionary;

import tp5.ex1.Motdico;
import tp5.ex2.Dictionnaire;

public class Main {
    public static void main(String[] args) {
        // Dictionnaire larou = new Dictionnaire("larousse", 1);
        // larou.ajoutermot(new Motdico("mot1", "definitions11"));
        Motdico mot1 = new Motdico("mot1", "definitions1");
        Motdico mot2 = new Motdico("mot2", "definitions2");
        Motdico mot3 = new Motdico("mot2", "definitions2");
        Motdico mot5 = new Motdico("mot1", "definitions1");
        Motdico mot4 = new Motdico("mot2", "definitions2");

        Dictionnaire larou = new Dictionnaire("larousse", 5);
        larou.ajoutermot(mot1);
        larou.ajoutermot(mot2);
        larou.ajoutermot(mot3);
        larou.ajoutermot(mot5);
        larou.ajoutermot(mot4);
        System.out.println("index: " + larou.cherchermot("mot2"));
        System.out.println("nombre synonyme larou " + larou.nbsysnonymes(mot3));
        larou.supprimermot("mot1");
        larou.listerdico();

    };
}
