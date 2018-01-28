package com.sdabyd2.programowanie.Model;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<Pozycja> pozycje = new ArrayList<>();
    private int ileDodanych;
    private int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public List<Pozycja> getPozycje() {
        return pozycje;
    }

    public void setPozycje(List<Pozycja> pozycje) {
        this.pozycje = pozycje;
    }

    public int getIleDodanych() {
        return ileDodanych;
    }

    public void setIleDodanych(int ileDodanych) {
        this.ileDodanych = ileDodanych;
    }

    public int getMaksRozmiar() {
        return maksRozmiar;
    }

    public void setMaksRozmiar(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }
    public void dodajPozycje(Pozycja p) {
        pozycje.add(p);
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (int i = 0; i < pozycje.size(); i++) {
            wartoscZamowienia += pozycje.get(i).obliczWartosc();
        }
        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        System.out.println("\n\nZamowienie");
        for (Pozycja s : pozycje) {
            System.out.println(s.toString());
        }
        System.out.println(obliczWartosc());
        return "";
    }
}