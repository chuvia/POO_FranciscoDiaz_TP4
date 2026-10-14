package edu.programacion.ejercicio2409;

import java.util.ArrayList;

public class Favoritos {

    private ArrayList<String> direccionesWeb;

    public Favoritos() {
        direccionesWeb = new ArrayList<>();
    }

    public void agregarFavorito(String direccion) {
        direccionesWeb.add(direccion);
    }

    public void eliminarFavorito(String direccion) {
        direccionesWeb.remove(direccion);
    }
}
