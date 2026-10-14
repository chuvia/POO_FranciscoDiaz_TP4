package edu.programacion.ejercicio2409;

import java.time.LocalDate;

public class Pagina {

    private String direccionWeb;
    private LocalDate fechaVisita;
    private double tamanio;
    private String codigoHTML;

    public Pagina(String direccionWeb, LocalDate fechaVisita,
                  double tamanio, String codigoHTML) {

        this.direccionWeb = direccionWeb;
        this.fechaVisita = fechaVisita;
        this.tamanio = tamanio;
        this.codigoHTML = codigoHTML;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }
}
