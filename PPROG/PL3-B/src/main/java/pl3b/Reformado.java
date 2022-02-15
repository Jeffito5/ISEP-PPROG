package pl3b;

/**
 * @author Luís Araújo
 */
public class Reformado extends ContribuinteComRT {
    /**
     * taxaRT
     */
    private static float taxaRT = 1;
    /**
     * taxaOR
     */
    private static float taxaOR = 3;

    /**
     * construtor completo
     *
     * @param nome
     * @param morada
     * @param OR
     * @param RT
     */
    public Reformado(String nome, String morada, float OR, float RT) {
        super(nome, morada, OR, RT);
    }

    /**
     * construtor vazio
     */
    public Reformado() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Reformado: %s %n", super.toString());
    }

    @Override
    public float obterTaxaRT() {
        return taxaRT;
    }

    @Override
    public float obterTaxaOutrosRendimentos() {
        return taxaOR;
    }

    /**
     * retorna a taxaRT
     *
     * @return taxaRT
     */
    public static float getTaxaRT() {
        return taxaRT;
    }

    /**
     * modifica a taxaRT
     *
     * @param taxaRT
     */
    public static void setTaxaRT(float taxaRT) {
        Reformado.taxaRT = taxaRT;
    }

    /**
     * retorna a taxaOR
     *
     * @return taxaOR
     */
    public static float getTaxaOR() {
        return taxaOR;
    }

    /**
     * modifica a taxaOR
     *
     * @param taxaOR
     */
    public static void setTaxaOR(float taxaOR) {
        Reformado.taxaOR = taxaOR;
    }
}
