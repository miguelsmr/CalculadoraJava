package edu.luzonPradoMiguel.endes;

/**
 * Clase que valida contraseñas según reglas básicas.
 */
public class ValidadorPassword {

    /**
     * Valida una contraseña.
     * Reglas:
     * - No puede ser null
     * - Mínimo 8 caracteres
     * - Al menos una mayúscula
     * - Al menos un número
     */
    public boolean validar(String password) {
        if (password == null) {
            return false;
        }
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}

