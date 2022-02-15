package pl4a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class TarifarioBiHorarioTest {

    @Test
    public void calcularCusto() {
        System.out.println("Calcular custo");
        TarifarioBiHorario instance = new TarifarioBiHorario(120, 580);
        float expResult = 77.92f;
        float result = instance.calcularCusto();
        assertEquals(expResult, result, 0.0);
    }
}