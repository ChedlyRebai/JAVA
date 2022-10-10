package cours.TD1.Ex3;

public class Testlivre {
    public static void main(String[] args) {
        Livre[] table;
        table = new Livre[3];
        table[0] = new Livre("l'achimiste", "coelho", 225);
        table[1] = new Livre("coran", 508);
        table[2] = new Livre("harry potter", "JK Rowling");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + ": titre: " + table[i].getTitre());
            System.out.println(i + ": Auteur: " + table[i].getAuteur());
            System.out.println(i + ": nombres de pages: " + table[i].getAuteur());
        }

        table[1].setTitre("Paulo Coelho");
        table[2].setNbPages(461);

        for (int i = 0; i < table.length; i++) {
            table[i].decrire();
        }

    }
}
