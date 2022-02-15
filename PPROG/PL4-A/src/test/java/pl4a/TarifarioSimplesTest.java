package pl4a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class TarifarioSimplesTest {

    @Test
    public void calcularCusto() {
        System.out.println("Calcular custo");
        TarifarioSimples instance = new TarifarioSimples(null, 234, 5.3f);
        float expResult = 30.42f;
        float result = instance.calcularCusto();
        assertEquals(expResult, result, 0.01);

        instance = new TarifarioSimples(null, 347, 6.9f);
        expResult = 55.52f;
        result = instance.calcularCusto();
        assertEquals(expResult, result, 0.01);

        instance = new TarifarioSimples(null, 98, 18.42f);
        expResult = 15.68f;
        result = instance.calcularCusto();
        assertEquals(expResult, result, 0.01);
    }
}