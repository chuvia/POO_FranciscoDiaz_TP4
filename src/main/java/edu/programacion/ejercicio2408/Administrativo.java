package edu.programacion.ejercicio2408;

public class Administrativo extends Empleado {

    private int categoria;
    private int antiguedad;

    public Administrativo(String nombre, int dni, String direccion,
                          int anioNacimiento, String sexo,
                          String funcion, int categoria, int antiguedad) {

        super(nombre, dni, direccion, anioNacimiento,
                sexo, funcion, 0);

        this.categoria = categoria;
        this.antiguedad = antiguedad;
        this.salario = antiguedad * categoria;
    }
}
