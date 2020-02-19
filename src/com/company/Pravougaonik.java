package com.company;

public class Pravougaonik extends Povrs implements Povrsina, Obim, Opisivanje {
    private double a;
    private double b;
    private double d;

    public Pravougaonik(Tacka centar, double a, double b) {
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
    public double povrsina() {
        double povrsina = a * b;
        return povrsina;
    }

    @Override
    public double obim() {
        double obim = 2 * (a + b);
        return obim;
    }

    @Override
    public Opisivanje opisivanje() {
        d = Math.sqrt((a * a) + (b * b));
        Krug k = new Krug(getCentar(),d/2);
        return k;
    }

    @Override
    public String toString() {
        return "Pravougaonik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
