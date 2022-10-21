package tp4.Ex1;

public class Calcul {
    public static void main(String[] args) {
        int n = 4;

        int n1 = 9;

        System.out.println("factoriel: " + Entier.factoriel(n));
        System.out.println("absolu: " + Entier.absolu(n));
        System.out.println("comparison: " + Entier.compare(4, 8));
        System.out.println((Entier.premier(n)) ? n + "est premier" : n + "n'est pas premier");

        Entier myobj = new Entier();
        System.out.println("factoriel: " + myobj.factoriel(n1));
        System.out.println("absolu: " + myobj.absolu(n1));
        System.out.println("comparison: " + myobj.compare(7, 19));
        System.out.println((myobj.premier(n1)) ? n + "est premier" : n + "n'est pas premier");

        Entier.friendly++;
        System.out.println(Entier.friendly);

        myobj.friendly++;
        System.err.println(myobj.friendly);

    }
}
