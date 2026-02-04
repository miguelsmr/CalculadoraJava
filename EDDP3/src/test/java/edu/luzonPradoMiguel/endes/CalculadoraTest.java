package edu.luzonPradoMiguel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar_funciona() {
        Calculadora c = new Calculadora();
        assertEquals(7, c.sumar(3, 4));
    }

    @Test
    void restar_funciona() {
        Calculadora c = new Calculadora();
        assertEquals(2, c.restar(5, 3));
    }

    @Test
    void multiplicar_funciona() {
        Calculadora c = new Calculadora();
        assertEquals(15, c.multiplicar(5, 3));
    }

    @Test
    void dividir_funciona() {
        Calculadora c = new Calculadora();
        assertEquals(2, c.dividir(10, 5));
    }

    @Test
    void dividir_entre_cero_lanza_excepcion() {
        Calculadora c = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> c.dividir(10, 0));
    }
}

