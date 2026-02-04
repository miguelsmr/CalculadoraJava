package edu.luzonPradoMiguel.endes;

/**
 * Conversor de temperaturas entre Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    /**
     * Convierte de Celsius a Fahrenheit.
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /**
     * Convierte de Fahrenheit a Celsius.
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}

