package tp3.ex2;

import tp3.ex1.Point;

public class testcercle {
    public static void main(String[] args) {
        Point p = new Point('a', 4);
        Cercle c = new Cercle(2, p);
        System.out.println("rayon : " + c.getRayon());
        System.out.println("surface " + c.Surface());
        c.setRayon(5);
        System.out.println("nouveau rayon " + c.getRayon());
    }
}
