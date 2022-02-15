package vencimentosComComparable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class TrabalhadorPecaTest {
    private TrabalhadorPeca trab3;

    @org.junit.Before
    public void setUp() throws Exception {
        trab3 = new TrabalhadorPeca("Catarina Lopes", 250, 500);
    }

    /**
     * Test of calcularVencimento method of class TrabalhadorPeca
     *
     * @throws Exception
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        float expResult = 6375.0f;
        float result = trab3.calcularVencimento();
        assertEquals(expResult, result, 0.005);
    }
}