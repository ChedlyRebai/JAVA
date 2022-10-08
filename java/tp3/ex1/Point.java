package tp3.ex1;

public class Point {
    private char id;

    private double abs;

    // identifiant du point

    // abscisse du point
    public Point(char c, double x) {
        this.id = c;
        this.abs = x;
    }

    public void affiche() {
        System.out.println("Point identifié par " + this.id + " d'abscisse " + this.abs);
    }

    public void translate(double dx) {
        abs += dx;
    }
}
