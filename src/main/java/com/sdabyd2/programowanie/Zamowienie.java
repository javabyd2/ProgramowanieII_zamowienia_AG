package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<Pozycja> pozycje = new ArrayList<>();
    private int ileDodanych;
    private int maksRozmiar = 10;

    public Zamowienie() {
    }

    Zamowienie(int maksRozmiar) {
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
        return"";
    }
}
