package com.company;

public class Rectangle extends Surface implements SurfaceArea, Circumference, Circumscription {
    private double a;
    private double b;
    private double d;

    public Rectangle(Dot centar, double a, double b) {
        super(centar);
        this.a = a;
        this.b = b;
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

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double surfaceArea() {
        return a * b;
    }

    @Override
    public double circumference() {
        return 2 * (a + b);
    }

    @Override
    public Circumscription circumscription() {
        d = Math.sqrt((a * a) + (b * b));
        return new Circle(getCenter(),d/2);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
