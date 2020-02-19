package com.company;

public class Povrs {

    private Tacka centar;

    public Povrs(Tacka centar) {
        this.centar = centar;
    }

    public Tacka getCentar() {
        return centar;
    }

    public void setCentar(Tacka centar) {
        this.centar = centar;
    }

    public double rastojanjeDoCentra(Povrs p) {
        return p.getCentar().rastojanje(centar);
    }

}
