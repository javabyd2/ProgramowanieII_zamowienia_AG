package com.sdabyd2.programowanie.Controller;

import com.sdabyd2.programowanie.Model.Pozycja;
import com.sdabyd2.programowanie.View.ZamowienieView;

import java.util.List;

public class ZamowieniaController {
    ZamowienieView zamowienieView;
    List<Pozycja> pozycjeLista;

    public ZamowieniaController(List<Pozycja> pozycjeLista, ZamowienieView zamowienieView) {
        this.zamowienieView = zamowienieView;
        this.pozycjeLista = pozycjeLista;
    }

    public void updateView() {
        this.pozycjeLista.toString();
    }
}