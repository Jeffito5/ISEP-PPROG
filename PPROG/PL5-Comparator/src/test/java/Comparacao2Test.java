import org.junit.Before;
import org.junit.Test;
import vencimentos.*;

import static org.junit.Assert.*;

/**
 * @author
 */
public class Comparacao2Test {
    private Trabalhador trab1, trab2, trab3;

    @Before
    public void setUp() {
        trab1 = new TrabalhadorComissao("Paulo Silva", 1000.0f, 3500.0f, 5.30f);
        trab2 = new TrabalhadorHora("Ana Neves", 100, 8.0f);
        trab3 = new TrabalhadorPeca("António Matos", 250, 500);
    }

    @Test
    public void testCompare() {
        System.out.println("Compare");

        Comparacao2 instance = new Comparacao2();
        String nome1 = trab1.getNome();
        String nome2 = trab3.getNome();
        int expResult = nome1.compareTo(nome2);
        int result = instance.compare(trab1, trab3);
        assertEquals(expResult, result);
    }
}
