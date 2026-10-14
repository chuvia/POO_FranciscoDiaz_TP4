package edu.programacion.ejercicio2404;

public class Circuloo extends Figura {

    private double radio;

    public Circuloo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}
