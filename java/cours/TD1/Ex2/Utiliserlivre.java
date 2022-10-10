package cours.TD1.Ex2;

/**
 * Utiliserlivre
 */
public class Utiliserlivre {

    public static void main(String[] args) {
        Livre l1 = new Livre("mark manson", "the subtle art of not giving a f");
        Livre l2 = new Livre("mark manson", "everything is #@%!ed: a book about hope");

        if (l1.getAuteur() == l2.getAuteur()) {
            System.out.println("les deux livres ont le même auteur.");
        } else {
            System.out.println("les deux livres ne sont pas  le même auteur ou non.");
        }
    }
}