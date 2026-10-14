package edu.programacion.ejercicio2403;

public class Temperature {


    //Si queremos cambiar la representacion interna de la clase cambiamos celsius por Rankine y habria que cambiar todas las formulas
    private double celsius;

    public Temperature() {

        this.celsius = 0;
    }

    public double getCelsius() {

        return celsius;
    }

    public void setCelsius(double value) {

        this.celsius = value;
    }

    public double getFahrenheit() {

        return (celsius * 1.8) + 32;
    }

    public double getKelvin() {
        double fahrenheit = celsius * 1.8 + 32;
        return (fahrenheit - 32) / 1.8 + 273.15;
    }

    //Aca cuando nos pasan los datos en fahrenheit o kelvin no importa, los convertimos a celsius y seguimos trabajando igual
    public void setFahrenheit(double value) {

        this.celsius = (value - 32) / 1.8;
    }
    public void setKelvin(double value) {

        double fahrenheit = (value - 273.15) * 1.8 + 32;
        this.celsius = (fahrenheit - 32) / 1.8;
    }
    // RANKINE

    public double getRankine() {
        return celsius * 9 / 5 + 491.67;
    }

    public void setRankine(double value) {
        this.celsius = (value - 491.67) * 5 / 9;
    }


    // REAUMUR

    public double getReaumur() {
        double fahrenheit = getFahrenheit();
        return (fahrenheit - 32) / 2.25;
    }

    public void setReaumur(double value) {
        double fahrenheit = value * 2.25 + 32;
        setFahrenheit(fahrenheit);
    }


    // CONVERTIDOR GENERAL

    public double convertTemperature(double value, String scale, String targetScale) {

        // Primero convertimos la temperatura recibida a Celsius
        if (scale.equalsIgnoreCase("Celsius")) {
            setCelsius(value);

        } else if (scale.equalsIgnoreCase("Fahrenheit")) {
            setFahrenheit(value);

        } else if (scale.equalsIgnoreCase("Kelvin")) {
            setKelvin(value);

        } else if (scale.equalsIgnoreCase("Rankine")) {
            setRankine(value);

        } else if (scale.equalsIgnoreCase("Reaumur")) {
            setReaumur(value);
        }


        // Después retornamos la temperatura en la escala deseada
        if (targetScale.equalsIgnoreCase("Celsius")) {
            return getCelsius();

        } else if (targetScale.equalsIgnoreCase("Fahrenheit")) {
            return getFahrenheit();

        } else if (targetScale.equalsIgnoreCase("Kelvin")) {
            return getKelvin();

        } else if (targetScale.equalsIgnoreCase("Rankine")) {
            return getRankine();

        } else if (targetScale.equalsIgnoreCase("Reaumur")) {
            return getReaumur();
        }

        return 0;
    }
}
