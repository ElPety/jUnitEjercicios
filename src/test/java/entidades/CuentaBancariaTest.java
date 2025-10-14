package entidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    private CuentaBancaria cuenta;
    private Persona persona;

    @BeforeEach
    void setUp() {
        persona = new Persona(1, "Franco", "Molinier", "46327948");
        cuenta = new CuentaBancaria(1, 1000, "0001", persona);
    }

    @Test
    void testDepositarDineroAumentaSaldo() {
        cuenta.ingresarDinero(500);
        assertEquals(1500, cuenta.getSaldo(), "El saldo debería ser 1500 después del depósito");
    }

    @Test
    void testRetirarDineroValidoDisminuyeSaldo() {
        boolean resultado = cuenta.retirarDinero(500);
        assertTrue(resultado, "El retiro debería ser exitoso");
        assertEquals(500, cuenta.getSaldo(), "El saldo debería disminuir a 500");
    }

    @Test
    void testNoSePuedeRetirarMasDeLoDisponible() {
        boolean resultado = cuenta.retirarDinero(1500);
        assertFalse(resultado, "No debería permitir retirar más de lo disponible");
        assertEquals(1000, cuenta.getSaldo(), "El saldo debería permanecer igual");
    }
}
