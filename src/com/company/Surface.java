package com.company;

public class Surface {

    private Dot center;

    public Surface(Dot center) {
        this.center = center;
    }

    public Dot getCenter() {
        return center;
    }

    public void setCenter(Dot centar) {
        this.center = centar;
    }

    public double distanceToCenter(Surface p) {
        return p.getCenter().distance(center);
    }

}
