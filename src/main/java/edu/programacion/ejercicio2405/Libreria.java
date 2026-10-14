package edu.programacion.ejercicio2405;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro unLibro) {
        libros.add(unLibro);
    }

    public void eliminarLibro(Libro unLibro) {
        libros.remove(unLibro);
    }

    public int cantidadDeLibros() {
        return libros.size();
    }

    public int cantidadTotalDeCopias() {

        int total = 0;

        for (Libro libro : libros) {
            total += libro.getCopiasStock();
        }

        return total;
    }
}
