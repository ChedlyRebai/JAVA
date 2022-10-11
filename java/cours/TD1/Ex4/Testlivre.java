package cours.TD1.Ex4;

public class Testlivre {
    public static void main(String[] args) {
        Livre l1 = new Livre("titre", "auteur", 2, 4);
        if (l1.testPrix()) {
            System.out.println("le prix est exist");
        } else {
            System.out.println("le prix n'existe pas");
        }
    }
}
