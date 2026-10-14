package edu.programacion.ejercicio2404;

public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public void pintar() {
        System.out.println("Pintando "
                + getClass().getSimpleName()
                + " " + color);
    }
}
