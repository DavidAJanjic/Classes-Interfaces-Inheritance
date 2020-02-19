package com.company;

public class Kvadrat extends Povrs implements Povrsina,Opisivanje,Obim{
    private double a;


    public Kvadrat(double a) {
        this.a = a;
    }

    public Kvadrat(Tacka centar, double a) {
        super(centar);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double povrsina() {

        double povrsina = a*a;
        return povrsina;
    }


    @Override
    public Opisivanje opisivanje() {

        double c = Math.sqrt((a*a)+(a*a));
        Krug k = new Krug(c/2);
        return k;
    }

    @Override
    public double obim() {

        double obim = 4*a;
        return obim;
    }

    @Override
    public String toString() {
        return "Kvadrat povrsine: " + povrsina() + " i stranica a: " + getA() + ".";
    }
}
