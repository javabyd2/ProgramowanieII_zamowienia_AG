package com.sdabyd2.programowanie;

public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    double obliczWartosc() {
        return this.ileSztuk * this.cena;
    }

    @Override
    public String toString() {
        String format = "%1$-20s %2$-10s %3$-4s %4$-20s";
        System.out.format(format, nazwaTowaru, cena + "zł", ileSztuk + "szt.", Double.toString(obliczWartosc()) + "zł");

        return "";
    }
}