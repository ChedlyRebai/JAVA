
package tp4.Ex2;

public class Banque {
    public static void main(String[] args) {
        Compte Co1 = new Compte();
        Compte Co2 = new Compte();
        /*
         * System.out.println("numero de " + Co1 + "est : " + Co1.numero);
         * System.out.println("solde de " + Co1 + "est : " + Co1.getsolde());
         * System.out.println("numero de " + Co2 + "est : " + Co2.numero);
         * System.out.println("solde de " + Co2 + "est : " + Co2.getsolde());
         */
        Co1.deposer(1200);
        Co2.deposer(500);

        System.out.println("solde de " + Co1 + "est : " + Co1.getsolde());
        System.out.println("solde de " + Co2 + "est : " + Co2.getsolde());

        Co1.transfere(700, Co2);
        System.out.println("solde de co1 " + "est : " + Co1.getsolde());
        System.out.println("solde de co2 " + "est : " + Co2.getsolde());

    }
}

package tp4.Ex2;

public class Banque {
    public static void main(String[] args) {
        Compte Co1 = new Compte();
        Compte Co2 = new Compte();
        /*
         * System.out.println("numero de " + Co1 + "est : " + Co1.numero);
         * System.out.println("solde de " + Co1 + "est : " + Co1.getsolde());
         * System.out.println("numero de " + Co2 + "est : " + Co2.numero);
         * System.out.println("solde de " + Co2 + "est : " + Co2.getsolde());
         */
        Co1.deposer(1200);
        Co2.deposer(500);

        System.out.println("solde de " + Co1 + "est : " + Co1.getsolde());
        System.out.println("solde de " + Co2 + "est : " + Co2.getsolde());

        Co1.transfere(700, Co2);
        System.out.println("solde de co1 " + "est : " + Co1.getsolde());
        System.out.println("solde de co2 " + "est : " + Co2.getsolde());

    }
}
