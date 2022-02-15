package pl4a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author
 */
public class ContadorGasTest {

    @Test
    public void calcularCusto() {
        System.out.println("Calcular custo");
        int consumo=2;
        float custoM3=0.8f;
        ContadorGas instance=new ContadorGas();
        instance.setConsumo(consumo);
        ContadorGas.setCustoUnitario(custoM3);
        float expResult=consumo*custoM3;

        float result= instance.calcularCusto();

        assertEquals(expResult, result, 0);
    }
}