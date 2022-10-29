package tp2;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        System.out.println("donner un nombre :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] couleur;
        couleur = new String[7];
        couleur[0] = "rouge";
        couleur[1] = "orange";
        couleur[2] = "jaune";
        couleur[3] = "vert";
        couleur[4] = "bleu";
        couleur[5] = "indigo";
        couleur[6] = "violet";
        System.out.println("couleur: " + couleur[num - 1]);
        sc.close();
    }
}
