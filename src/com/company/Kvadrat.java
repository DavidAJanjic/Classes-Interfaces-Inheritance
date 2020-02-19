package com.company;

public class Kvadrat extends Povrs implements Povrsina, Opisivanje, Obim {
    private double a;
    private double d;

    public Kvadrat(Tacka centar, double a) {
        super(centar);
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
    public double povrsina() {

        double povrsina = a * a;
        return povrsina;
    }


    @Override
    public Opisivanje opisivanje() {
        d = Math.sqrt((a * a) + (a * a));
        Tacka tacka = new Tacka();
        tacka.setY(a / 2);
        tacka.setX(a / 2);
        Krug k = new Krug(tacka, d / 2);
        return k;
    }

    @Override
    public double obim() {

        double obim = 4 * a;
        return obim;
    }

    @Override
    public String toString() {
        return "Kvadrat povrsine: " + povrsina() + " i stranica a: " + getA() + " i centra na koordinatama X: " +
                getCentar().getX() + " i Y: " + getCentar().getY() + ".";
    }
}
