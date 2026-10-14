package edu.programacion.ejercicio2404;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
