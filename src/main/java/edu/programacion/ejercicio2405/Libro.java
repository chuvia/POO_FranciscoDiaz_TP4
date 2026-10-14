package edu.programacion.ejercicio2405;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro {

    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private ArrayList<Personaje> personajes;
    private int copiasStock;

    public Libro(String titulo, String autor, LocalDate fechaPublicacion, int copiasStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.copiasStock = copiasStock;
        this.personajes = new ArrayList<>();
    }

    public int getCopiasStock() {
        return copiasStock;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}
