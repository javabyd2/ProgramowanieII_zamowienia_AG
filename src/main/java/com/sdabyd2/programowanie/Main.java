package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.Controller.ZamowieniaController;
import com.sdabyd2.programowanie.Model.Pozycja;
import com.sdabyd2.programowanie.Model.Zamowienie;
import com.sdabyd2.programowanie.View.ZamowienieView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Pozycja> pozycjeLista = new ArrayList<>();
        ZamowienieView zamowienieView = new ZamowienieView();
        Zamowienie zamowienie = new Zamowienie();

        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        Pozycja p8 = new Pozycja("Chleb", 5, 3.5);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        Pozycja p3 = new Pozycja("Mleko", 6, 4.5);
        Pozycja p4 = new Pozycja("Ciastka", 2, 8.5);
        Pozycja p5 = new Pozycja("Woda", 12, 2.5);
        Pozycja p6 = new Pozycja("Pepsi", 1, 6);
        Pozycja p7 = new Pozycja("Ser", 2, 12);
        pozycjeLista.add(p1);
        pozycjeLista.add(p2);
        pozycjeLista.add(p3);
        pozycjeLista.add(p4);
        pozycjeLista.add(p5);
        pozycjeLista.add(p6);
        pozycjeLista.add(p7);

        zamowienie.setPozycje(pozycjeLista);
//        zamowienie.edytujPozycje(1);
        zamowienie.dodajPozycje(p8);
//        zamowienie.usunPozycje(3);
//        zamowienie.usunPozycje(4);

        ZamowieniaController zamowieniaController = new ZamowieniaController(pozycjeLista, zamowienieView);
      //  zamowieniaController.updateView();

        zamowienieView.displayZamowienie(zamowienie);
    }
}