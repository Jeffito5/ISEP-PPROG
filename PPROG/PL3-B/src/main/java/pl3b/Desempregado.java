package pl3b;

import sun.security.krb5.internal.crypto.Des;

/**
 * @author Luís Araújo
 */
public class Desempregado extends Contribuinte {
    /**
     * taxa sobre outros rendimentos
     */
    private static float taxaOR = 2;
    /**
     * número de meses parado
     */
    private int mesesParado;
    /**
     * valor do OR
     */
    private static final float outroR = 0;
    /**
     * Valor da taxa de OR por omissão
     */
    private final float TAXA_POR_OMISSAO = 0;
    /**
     * número de meses por omissão
     */
    private final int MESES_POR_OMISSAO = 0;
    /**
     * Construtor sem parâmetros
     */
    public Desempregado() {
        super();
        mesesParado = MESES_POR_OMISSAO;
    }
    /**
     * construtor completo
     *
     * @param nome
     * @param morada
     * @param outroR
     * @param mesesParado
     */
    public Desempregado(String nome, String morada, float outroR, int mesesParado) {
        super(nome, morada, outroR);
        this.mesesParado = mesesParado;
    }

    /**
     * retorna os meses
     * @return meses
     */
    public int getMesesParado() {
        return mesesParado;
    }

    /**
     * modifica o número de meses
     * @param mesesParado
     */
    public void setMesesParado(int mesesParado) {
        this.mesesParado = mesesParado;
    }

    /**
     * retorna a taxaOR
     * @return
     */
    public static float getTaxaOR() {
        return taxaOR;
    }

    /**
     * modifica a taxaOR
     * @param taxaOR
     */
    public static void setTaxaOR(float taxaOR) {
        Desempregado.taxaOR= taxaOR;
    }
    /**
     * Imprime as informações do desempregado
     */
    @Override
    public String toString() {
        return String.format("%s\nMeses parado: %d "
                        + "\nTaxa de outros rendimentos: %.2f",
                super.toString(), mesesParado, taxaOR);
    }
    /**
     * calcula o imposto
     * @return imposto
     */
    @Override
    public float calcularImposto() {
        return outroR * (taxaOR / 100);
    }

}
