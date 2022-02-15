import org.junit.Before;
import org.junit.Test;
import vencimentos.*;

import static org.junit.Assert.*;

/**
 * @author Luís Araújo
 */
public class Comparacao1Test {
    private Trabalhador trab1, trab2, trab3;

    @Before
    public void setUp() {
        trab1 = new TrabalhadorComissao("Paulo Silva", 1000.0f, 3500.0f, 5.30f);
        trab2 = new TrabalhadorHora("Ana Neves", 100, 8.0f);
        trab3 = new TrabalhadorPeca("António Matos", 250, 500);
    }

    @Test
    public void testCompareZero() {
        System.out.println("Compare");
        Comparacao1 instance = new Comparacao1();
        int expResult = 0;
        int result = instance.compare(trab1, trab3);
        assertEquals(expResult, result);
    }

    public void testComparePos() {
        System.out.println("Compare");
        Comparacao1 instance = new Comparacao1();
        int expResult = 1;
        int result = instance.compare(trab1, trab2);
        assertEquals(expResult, result);

    }

    public void testCompareNeg() {
        System.out.println("Compare");
        Comparacao1 instance = new Comparacao1();
        int expResult = -1;
        int result = instance.compare(trab2, trab1);
        assertEquals(expResult, result);
    }
}