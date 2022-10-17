package tp4.Ex3;

public class Maison {
    public String type, adr;
    public int nbchambre;
    public float surface;

    Maison(String adr, String type, int nb) {
        this.adr = adr;
        this.type = type;
        this.nbchambre = nb;
    }

    Maison(String adr, String type, int nb, float surface) {
        this(adr, type, nb);
        this.surface = surface;
    }

    public void setsurface(float s) {
        this.surface = s;
    }

    public float calculPrix(float pmc) {
        return pmc * this.surface;
    }

    public float calculPrix() {
        return 2100 * this.surface;
    }

    public String toChaine() {
        return this.type + " de " + this.surface + " à " + this.adr + " avec " + this.nbchambre + " chambres.";
    }

    public static void main(String[] args) {
        Maison m1 = new Maison("tunis", "un deplex", 4, 210);
        Maison m2 = new Maison("nabeul", "une villa ", 5);

        System.out.println(m1.toChaine());
        System.out.println(m2.toChaine());

        m2.setsurface(230);

        System.out.println("le prix de la maison de maniere 1 : " + m2.calculPrix());

        System.out.println("le prix de la maison de maniere 1 : " + m2.calculPrix(5));

    }
}
