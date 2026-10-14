package edu.programacion.ejercicio2406;

import java.util.ArrayList;

public abstract class Contenido {

    protected String titulo;
    protected ArrayList<Actor> actores;
    protected ArrayList<Director> directores;
    protected ArrayList<Personaje> personajes;

    public Contenido(String titulo) {
        this.titulo = titulo;
        this.actores = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.personajes = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void agregarDirector(Director director) {
        directores.add(director);
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
}