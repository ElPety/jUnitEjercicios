package entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @Test
    void testCelsiusAFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();

        float resultado;

        // 0 C -> 32 F
        resultado = conversor.celAfahr(0);
        assertEquals(32.0f, resultado, 0.001f, "0 C debe ser 32 F");

        // 100 C -> 212 F
        resultado = conversor.celAfahr(100);
        assertEquals(212.0f, resultado, 0.001f, "100 C debe ser 212 F");

        // 32 c -> 89.6 F
        //si eliminamos el delta, que seria el error aceptable el nos envia el mensaje colocado
        resultado = conversor.celAfahr(32);
        assertEquals(89.6, resultado, 0.01f,"32 C debe ser 89.6");
    }

    @Test
    void testFahrenheitACelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura();

        float resultado;

        // 32 F -> 0 C
        resultado = conversor.farhAcel(32);
        assertEquals(0.0f, resultado, 0.001f, "32 F debe ser 0 C");

        // 65 F -> 18.3 C
        resultado = conversor.farhAcel(65);
        assertEquals(18.3f, resultado, 0.1f, "65 F debe ser 18.3 C");

        // 212 F -> 100 C
        resultado = conversor.farhAcel(212);
        assertEquals(100.0f, resultado, 0.001f, "212 F debe ser 100 C");
    }
}
