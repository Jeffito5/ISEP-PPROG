import pl6.TrabalhadorContaOutrem;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author
 */
class CalcularImpostoTest {
    private TrabalhadorContaOutrem tco1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        tco1 = new TrabalhadorContaOutrem("Marta Meireles","Braga",  1000.0f, 800.0f, "Martins e Filhos LDA");
    }
    public void testCalcularImposto(){
        System.out.println("Calcular Imposto");
        float expResult=26.0f;
        float result=tco1.calcularImposto();
        assertEquals(expResult, result, 0.005f);
    }
}