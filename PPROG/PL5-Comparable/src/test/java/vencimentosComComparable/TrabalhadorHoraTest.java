package vencimentosComComparable;

import org.junit.Test;
import vencimentosComComparable.TrabalhadorHora;

import static org.junit.Assert.*;

/**
 * @author
 */
public class TrabalhadorHoraTest {
    private TrabalhadorHora trab2;

    @org.junit.Before
    public void setUp() throws Exception {
        trab2 = new TrabalhadorHora("Ana Neves", 100, 8.0f);
    }

    /**
     * Test of calcularVencimento method of class TrabalhadorHora
     *
     * @throws Exception
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        float expResult = 800.0f;
        float result = trab2.calcularVencimento();
        assertEquals(expResult, result, 0.005);
    }
}