package edu.programacion.ejercicio2406;

import java.util.ArrayList;

public class Serie extends Contenido {

    private ArrayList<Capitulo> capitulos;

    public Serie(String titulo) {
        super(titulo);
        this.capitulos = new ArrayList<>();
    }

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }
}
