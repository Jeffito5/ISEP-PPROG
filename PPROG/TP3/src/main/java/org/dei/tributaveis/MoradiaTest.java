package org.dei.tributaveis;

import static org.junit.Assert.*;

/**
 * @author Luís Araújo
 */
public class MoradiaTest {

    @org.junit.Test
    public void calcularImposto() {
        //arrange- preparar a informação necessária para executar o teste
        Moradia instance=new Moradia("Rua do Bocage", 90, Moradia.CINZNTO);
        float expResult=180;

        // act- executar o teste e receber o resultado
        float result= instance.calcularImposto();

        //assert- verificar se o teste teve sucesso ou não
        assertEquals(expResult, result, 0.0);
    }
}