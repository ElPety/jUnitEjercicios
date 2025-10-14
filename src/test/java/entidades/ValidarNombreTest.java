package entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidarNombreTest {

    @Test
    void testLanzaExcepcionSiNombreEsNulo() {
        ValidarNombre validador = new ValidarNombre();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { validador.validarNombre(null);});
        assertEquals("El nombre no puede ser nulo", exception.getMessage());
    }

    @Test
    void testLanzaExcepcionSiNombreVacio() {
        ValidarNombre validador = new ValidarNombre();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { validador.validarNombre("  ");});
        assertEquals("El nombre no puede estar vacio", exception.getMessage());
    }

    @Test
    void testNoLanzaExcepcionConNombreValido() {
        ValidarNombre validador = new ValidarNombre();
        assertDoesNotThrow(() -> validador.validarNombre("Franco"));
    }

    @Test
    void testNoLanzaExcepcionConNombreValido2() {
        ValidarNombre validador2 = new ValidarNombre();
        assertDoesNotThrow(() -> validador2.validarNombre("Juan"));
    }
}
