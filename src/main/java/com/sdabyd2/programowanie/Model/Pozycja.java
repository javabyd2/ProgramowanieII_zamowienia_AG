package com.sdabyd2.programowanie.Model;

public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja() {
    }

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    double obliczWartosc() {
        return this.ileSztuk * this.cena;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        String format = "%1$-20s %2$-10s %3$-4s %4$-20s";
        System.out.format(format, "\n" + nazwaTowaru, cena + "zł", ileSztuk + "szt.", Double.toString(obliczWartosc()) + "zł");

        return "";
    }
}