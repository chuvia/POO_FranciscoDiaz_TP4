package edu.programacion.ejercicio2408;

public class Persona {

    protected String nombre;
    protected int dni;
    protected String direccion;
    protected int anioNacimiento;
    protected String sexo;

    public Persona(String nombre, int dni, String direccion,
                   int anioNacimiento, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.anioNacimiento = anioNacimiento;
        this.sexo = sexo;
    }
}
