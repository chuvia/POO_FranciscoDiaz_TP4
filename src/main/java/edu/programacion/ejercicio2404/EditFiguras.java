package edu.programacion.ejercicio2404;

import java.util.ArrayList;

public class EditFiguras {

    private ArrayList<Figura> figuras;

    public EditFiguras() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void borrarFigura(Figura figura) {
        figuras.remove(figura);
    }

    public void pintar() {
        for (Figura figura : figuras) {
            figura.pintar();
        }
    }

    public double calcularArea() {

        double areaTotal = 0;

        for (Figura figura : figuras) {
            areaTotal += figura.getArea();
        }

        return areaTotal;
    }
}
