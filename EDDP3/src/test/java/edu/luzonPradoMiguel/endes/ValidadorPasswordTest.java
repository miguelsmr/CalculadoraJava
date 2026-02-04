package edu.luzonPradoMiguel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorPasswordTest {

    @Test
    void null_no_es_valida() {
        ValidadorPassword v = new ValidadorPassword();
        assertFalse(v.validar(null));
    }

    @Test
    void corta_no_es_valida() {
        ValidadorPassword v = new ValidadorPassword();
        assertFalse(v.validar("A1b"));
    }

    @Test
    void sin_mayuscula_no_es_valida() {
        ValidadorPassword v = new ValidadorPassword();
        assertFalse(v.validar("password1"));
    }

    @Test
    void sin_numero_no_es_valida() {
        ValidadorPassword v = new ValidadorPassword();
        assertFalse(v.validar("Password"));
    }

    @Test
    void valida_cumple_todo() {
        ValidadorPassword v = new ValidadorPassword();
        assertTrue(v.validar("Password1"));
    }
}

