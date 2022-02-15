package vencimentosComComparable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class TrabalhadorComissaoTest {
    private TrabalhadorComissao trab3;

    @Before
    public void setUp() throws Exception {
        trab3 = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
    }

    /**
     * Test of calcularVencimento method of class TrabalhadorComissao
     *
     * @throws Exception
     */
    @Test
    public void calcularVencimento() {
        System.out.println("calcularVencimento");
        float expResult = 590.0f;
        float result = trab3.calcularVencimento();
        assertEquals(expResult, result, 0.005);
    }
}