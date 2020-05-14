package com.company;

public class Circle extends Surface implements Circumference, SurfaceArea, Circumscription {
    private double r;

    public Circle(Dot centar, double r) {
        super(centar);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double circumference() {

        return 2 * r * 3.14;
    }

    @Override
    public double surfaceArea() {

        return r * r * 3.14;
    }

    @Override
    public Circumscription circumscription() {
        double a = r * 2;
        return new Square(getCenter(),a);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r + "; center =" + getCenter() +
                '}';
    }
}
