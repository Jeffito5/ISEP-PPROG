package vencimentosComComparable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class TrabalhadorTest {
    private  Trabalhador trab1, trab2, trab3;

    @Before
    public void setUp(){
        trab1=new TrabalhadorComissao("Paulo Silva", 1000.0f, 3500.0f, 5.30f);
        trab2=new TrabalhadorHora("Ana Neves", 100, 8.0f);
        trab3=new TrabalhadorPeca("António Matos", 250, 500);
    }

    @Test
    public void compareTo1() {
        float expected = 1;
        float result = trab1.compareTo(trab3);
        assertEquals(expected,result,0.01);
    }

    @Test
    public void compareTo2() {
        float expected = -1;
        float result = trab1.compareTo(trab2);
        assertEquals(expected,result,0.01);
    }

    @Test
    public void compareTo3() {
        float expected = 0;
        float result = trab2.compareTo(trab3);
        assertEquals(expected,result,0.01);
    }
}