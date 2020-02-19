package com.company;

public class Krug extends Povrs implements Obim, Povrsina, Opisivanje {
    private double r;

    public Krug(Tacka centar, double r) {
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
    public double obim() {

        double obim = 2 * r * 3.14;
        return obim;
    }

    @Override
    public double povrsina() {

        double povrsina = r * r * 3.14;
        return povrsina;
    }

    @Override
    public Opisivanje opisivanje() {
        double a = r * 2;
        Tacka tacka = new Tacka();
        tacka.setX(r);
        tacka.setY(r);
        Kvadrat k1 = new Kvadrat(tacka,a);
        return k1;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "r=" + r + "; centar =" + getCentar() +
                '}';
    }
}
