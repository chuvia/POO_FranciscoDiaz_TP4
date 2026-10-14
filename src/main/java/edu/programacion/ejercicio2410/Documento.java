package edu.programacion.ejercicio2410;

import java.time.LocalDate;
import java.util.ArrayList;

public class Documento {

    private String nombre;
    private String texto;
    private LocalDate fechaCreacion;
    private Persona duenio;
    private ArrayList<Persona> editores;

    public Documento(String nombre, String texto,
                     LocalDate fechaCreacion, Persona duenio) {

        this.nombre = nombre;
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
        this.duenio = duenio;
        this.editores = new ArrayList<>();
    }

    public void agregarEditor(Persona editor) {
        editores.add(editor);
    }

    public int cantidadEditores() {
        return editores.size();
    }
}
