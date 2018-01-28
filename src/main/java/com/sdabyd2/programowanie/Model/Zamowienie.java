package com.sdabyd2.programowanie.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zamowienie {
    private List<Pozycja> pozycje = new ArrayList<>();
    private int ileDodanych;
    private int maksRozmiar;
    Scanner scanner = new Scanner(System.in);

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
        boolean podmien = false;
        for (int j = 0; j < pozycje.size(); j++) {
            if (pozycje.get(j).getNazwaTowaru().equalsIgnoreCase(p.getNazwaTowaru())) {
                podmien = true;
                break;
            } else {
                podmien = false;
            }
        }

        if (podmien) {
            for (int i = 0; i < pozycje.size(); i++) {
                if (pozycje.get(i).getNazwaTowaru().equalsIgnoreCase(p.getNazwaTowaru())) {
                    pozycje.get(i).setCena(p.getCena());
                    pozycje.get(i).setIleSztuk(p.getIleSztuk() + pozycje.get(i).getIleSztuk());
                }
            }
        } else
            pozycje.add(p);
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (int i = 0; i < pozycje.size(); i++) {
            wartoscZamowienia += pozycje.get(i).obliczWartosc();
        }
        return wartoscZamowienia;
    }

    public void usunPozycje(int numberPos) {
        pozycje.remove(numberPos);
    }

    public void edytujPozycje(int numberPos) {
        System.out.println("Podaj nową nazwę");
        pozycje.remove(numberPos);
        System.out.println("Nowa nazwa");
        String nazwa = scanner.next();
        System.out.println("Ile sztuk?");
        int ileSztuk = scanner.nextInt();
        System.out.println("Jaka cena?");
        double jakaCena = scanner.nextDouble();
        pozycje.add(new Pozycja(nazwa, ileSztuk, jakaCena));
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