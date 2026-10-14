package edu.programacion.ejercicio2404;

public class Linea extends Figura {

    private double longitud;

    public Linea(String color, double longitud) {
        super(color);
        this.longitud = longitud;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
