package edu.programacion.ejercicio2410;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {

    private Persona duenio;
    private String idioma;
    private LocalDate fechaCreacion;
    private ArrayList<Documento> documentos;

    public Sistema(Persona duenio, String idioma,
                                    LocalDate fechaCreacion) {

        this.duenio = duenio;
        this.idioma = idioma;
        this.fechaCreacion = fechaCreacion;
        this.documentos = new ArrayList<>();
    }

    public void agregarDocumento(Documento unDocumento) {
        documentos.add(unDocumento);
    }

    public int cantidadDocumentos() {
        return documentos.size();
    }

    public int cantidadEditores(Documento unDocumento) {
        return unDocumento.cantidadEditores();
    }

    public void agregarEditor(Documento unDocumento, Persona unEditor) {
        unDocumento.agregarEditor(unEditor);
    }

    public int cantidadTotalEditores() {

        int total = 0;

        for (Documento documento : documentos) {
            total += documento.cantidadEditores();
        }

        return total;
    }
}
