package com.company;

public class Square extends Surface implements SurfaceArea, Circumscription, Circumference {
    private double a;
    private double d;

    public Square(Dot centre, double a) {
        super(centre);
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double surfaceArea() {

        return a * a;
    }


    @Override
    public Circumscription circumscription() {
        d = Math.sqrt((a * a) + (a * a));
        return new Circle(getCenter(), d / 2);
    }

    @Override
    public double circumference() {

        return 4 * a;
    }

    @Override
    public String toString() {
        return "Square with surface area of: " + surfaceArea() + " and sides -a- the length of: " + getA() +
                " and center on the coordinates X: " + getCenter().getX() + " and Y: " + getCenter().getY() + ".";
    }
}
