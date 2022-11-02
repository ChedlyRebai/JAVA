
package cours.TD1.Ex1;

public class Compareentier {

    public static void main(String[] args) {
        Entier e1 = new Entier(5);
        Entier e2 = new Entier(10);
        e1.incrementer(10);
        System.out.println(e1.getN());
        if (e1.getN() > e2.getN()) {
            System.out.println(e1.getN() + " est plus grand");
        } else {
            System.out.println(e2.getN() + " est plus grand");
        }

    }
}
