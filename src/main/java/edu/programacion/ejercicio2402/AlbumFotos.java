package edu.programacion.ejercicio2402;

import java.util.ArrayList;

public class AlbumFotos {

    private String nombre;
    private ArrayList<Foto> fotos;

    public AlbumFotos(String nombre) {
        this.nombre = nombre;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    // Aca en vez de pasar 1 sola foto, pasamos una lista de varias fotos
    public void agregarFotos(ArrayList<Foto> nuevasFotos) {
        fotos.addAll(nuevasFotos);
    }

    public void eliminarFoto(Foto foto) {
        fotos.remove(foto);
    }

    public void limpiarAlbum() {
        fotos.clear();
    }

    public int cantidadFotos() {
        return fotos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
