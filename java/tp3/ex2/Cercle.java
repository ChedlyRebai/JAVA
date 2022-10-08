package tp3.ex2;

import java.lang.Math;

import tp3.ex1.Point;

public class Cercle {

    private int rayon;
    public Point center;

    public Cercle(int r, Point c) {
        this.rayon = r;
        this.center = c;
    }

    public double Surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public int getRayon() {
        return this.rayon;
    }

    public void setRayon(int r) {
        this.rayon = r;
    }

}
