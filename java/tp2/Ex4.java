package tp2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        float x = 0;
        while (n <= 0) {
            System.out.println("donner un nombre strictement positive(entier): ");
            n = sc.nextInt();

        }
        while (x <= 0) {
            System.out.println("donner un nombre  strictement positive(reel): ");
            x = sc.nextFloat();

        }

        System.out.println("resultat: " + (int) Math.pow(x, n));

        sc.close();
    }
}
