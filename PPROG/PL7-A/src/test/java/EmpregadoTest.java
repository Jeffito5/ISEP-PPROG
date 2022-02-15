import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class EmpregadoTest {
    Empregado e1;

    @Before
    public void setUp() throws Exception {
        Data d1 = Data.dataAtual();
        Tempo t1 = new Tempo(17, 30, 25);
        Tempo t2 = new Tempo(8, 30, 45);
        e1 = new Empregado("Pedro", "Amaral", d1, t2, t1);
    }

    @Test
    public void calcularHorasSemanais() {
        float expResult = 40f;
        float result = e1.calcularHorasSemanais();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void tempoDeContrato() {
        int expResult = 0;
        int result = e1.tempoDeContrato();
        assertEquals(expResult, result, 0.1);
    }
}