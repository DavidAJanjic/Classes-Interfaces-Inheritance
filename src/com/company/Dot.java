package com.company;

public class Dot {
    private double x;
    private double y;

    public Dot() {
    }

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Dot t) {
        double a = Math.abs(t.getX() - x);
        double b = Math.abs(t.getY() - y);
        double c = (a * a) + (b * b);
        return Math.sqrt(c);
    }

    @Override
    public String toString() {
        return "X: " + x + " Y: " + y;
    }
}
