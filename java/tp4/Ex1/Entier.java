
package tp4.Ex1;

public class Entier {

    public static int friendly = 0;

    public static int factoriel(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int absolu(int n) {
        return Math.abs(n);
    }

    public static String compare(int e1, int e2) {
        return (e1 > e2) ? e1 + "est plus grand" : e2 + "est plus grand";
    }

    public static boolean premier(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
