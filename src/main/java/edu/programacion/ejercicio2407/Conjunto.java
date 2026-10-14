package edu.programacion.ejercicio2407;

import java.util.ArrayList;

public class Conjunto {

    private ArrayList<Persona> personas;

    public Conjunto() {
        personas = new ArrayList<>();
    }

    public void add(Persona persona) {

        if (!contiene(persona)) {
            personas.add(persona);
        }
    }

    public void remove(Persona persona) {

        for (Persona p : personas) {
            if (p.getDni() == persona.getDni()) {
                personas.remove(p);
                return;
            }
        }
    }

    private boolean contiene(Persona persona) {

        for (Persona p : personas) {
            if (p.getDni() == persona.getDni()) {
                return true;
            }
        }

        return false;
    }

    public Conjunto union(Conjunto otro) {

        Conjunto resultado = new Conjunto();

        for (Persona p : personas) {
            resultado.add(p);
        }

        for (Persona p : otro.personas) {
            resultado.add(p);
        }

        return resultado;
    }

    public Conjunto interseccion(Conjunto otro) {

        Conjunto resultado = new Conjunto();

        for (Persona p : personas) {
            if (otro.contiene(p)) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    public Conjunto diferencia(Conjunto otro) {

        Conjunto resultado = new Conjunto();

        for (Persona p : personas) {
            if (!otro.contiene(p)) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    public Conjunto diferenciaSimetrica(Conjunto otro) {

        Conjunto diferencia1 = this.diferencia(otro);
        Conjunto diferencia2 = otro.diferencia(this);

        return diferencia1.union(diferencia2);
    }

    public void mostrar() {

        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }
    }
}