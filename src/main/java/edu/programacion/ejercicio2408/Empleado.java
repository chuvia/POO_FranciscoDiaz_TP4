package edu.programacion.ejercicio2408;

public class Empleado extends Persona {

    protected String funcion;
    protected double salario;

    public Empleado(String nombre, int dni, String direccion,
                    int anioNacimiento, String sexo,
                    String funcion, double salario) {

        super(nombre, dni, direccion, anioNacimiento, sexo);

        this.funcion = funcion;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
