package tp1;

import java.util.Scanner;

public class Maclasse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un entier \n");
        int num1 = sc.nextInt();
        System.out.println("donner un entier \n");
        int num2 = sc.nextInt();
        System.out.println("donner l'operation");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + num1 + num2);
                break;
            case '-':
                int num = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + num);
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
                break;

            default:
                System.out.println("erreur");
                break;
        }
        sc.close();
    }
}