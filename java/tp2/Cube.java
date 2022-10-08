import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        System.out.println("donner un nombre positive: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int intResult = (int) Math.pow(num, 3);
        System.out.println(intResult);
        sc.close();

        // Scanner sc = new Scanner(System.in);
        // int somme = 0;
        // int num;
        // int[] t;
        // t = new int[5];
        // for (int i = 0; i < t.length; i++) {

        // System.out.println("donner un nombre: \n");
        // num = sc.nextInt();

        // t[i] = (int) Math.pow(num, 3);
        // somme = somme + t[i];

        // }

        // System.out.println("somme: " + somme);
        // sc.close();
    }
}
