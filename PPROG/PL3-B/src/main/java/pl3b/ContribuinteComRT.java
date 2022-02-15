package pl3b;

/**
 * @author Luís Araújo
 */
public abstract class ContribuinteComRT extends Contribuinte {
    /**
     * atributo RT
     */
    private float RT;
    /**
     * RT por omissão
     */
    private static final float RT_POR_OMISSAO = 0;

    /**
     * construtor completo
     *
     * @param nome
     * @param morada
     * @param OR
     * @param RT
     */
    public ContribuinteComRT(String nome, String morada, float OR, float RT) {
        super(nome, morada, OR);
        this.RT = RT;
    }

    /**
     * construtor vazio
     */
    public ContribuinteComRT() {
        super();
        RT = RT_POR_OMISSAO;
    }

    /**
     * retorna o RT
     *
     * @return RT
     */
    public float getRT() {
        return RT;
    }

    /**
     * modifica o RT
     *
     * @param RT
     */
    public void setRT(float RT) {
        this.RT = RT;
    }

    /**
     * Representação textual do contribuinte RT
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s %nRendimentos de trabalho: %.2f euros"
                        + "%nTaxa sobre RT: %.1f"
                        + "%nTaxa sobre OR: %.1f",
                super.toString(), RT, obterTaxaRT(), obterTaxaOutrosRendimentos());
    }

    public float calcularImposto() {
        return (RT * obterTaxaRT() *
                getOutrosRendimentos() * obterTaxaOutrosRendimentos()) / 100;
    }

    public abstract float obterTaxaRT();

    public abstract float obterTaxaOutrosRendimentos();
}
