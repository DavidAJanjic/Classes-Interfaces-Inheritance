package com.company;

public class Main {

    public static void main(String args[]) {

        Krug krug = new Krug(5);

        Kvadrat kvadrat = new Kvadrat(4);

        Pravougaonik pravougaonik = new Pravougaonik(3,6);

        Tacka tacka = new Tacka(4,4);
        Tacka tacka1 = new Tacka(1,1);

        System.out.println("KRUG");

        System.out.println(krug.obim());
        System.out.println(krug.povrsina());
        System.out.println(krug.opisivanje());

        System.out.println("\nPRAVOUGAONIK");

        System.out.println(pravougaonik.obim());
        System.out.println(pravougaonik.opisivanje());
        System.out.println(pravougaonik.povrsina());

        System.out.println("\nKVADRAT");

        System.out.println(kvadrat.opisivanje());
        System.out.println(kvadrat.povrsina());
        System.out.println(kvadrat.obim());

        System.out.println(tacka.rastojanje(tacka1));


    }
}
