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
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        pozycjeLista.add(p1);
        pozycjeLista.add(p2);

        zamowienie.setPozycje(pozycjeLista);

        ZamowieniaController zamowieniaController = new ZamowieniaController(pozycjeLista, zamowienieView);
        zamowieniaController.updateView();

        zamowienieView.displayZamowienie(zamowienie);
    }
}