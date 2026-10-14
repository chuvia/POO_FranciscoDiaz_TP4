package edu.programacion.ejercicio2408;

public class Tecnico extends Empleado {

    private String titulo;

    public Tecnico(String nombre, int dni, String direccion,
                   int anioNacimiento, String sexo,
                   String funcion, double salario, String titulo) {

        super(nombre, dni, direccion, anioNacimiento,
                sexo, funcion, salario);

        this.titulo = titulo;
    }
}
