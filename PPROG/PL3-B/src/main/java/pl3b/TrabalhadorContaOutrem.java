package pl3b;

/**
 * @author Luís Araújo
 */
public class TrabalhadorContaOutrem extends ContribuinteComRT {
    /**
     * nome da empresa
     */
    private String empresa;
    /**
     * empresa por omissao
     */
    private static final String EMPRESA_POR_OMISSAO = "sem empresa.";
    /**
     * limite do 1º escalao
     */
    private static float escalaoRT = 30000;
    /**
     * taxa sobre o t1
     */
    private static float taxaRT1 = 1;
    /**
     * taxa sobre o t2
     */
    private static float taxaRT2 = 2;
    /**
     * taxa sobre os or
     */
    private static float taxaOR = 2;

    /**
     * construtor completo
     *
     * @param nome
     * @param morada
     * @param RT
     * @param OR
     * @param empresa
     */
    public TrabalhadorContaOutrem(String nome, String morada, float RT, float OR, String empresa) {
        super(nome, morada, OR, RT);
        this.empresa = empresa;
    }

    /**
     * construtor vazio
     */
    public TrabalhadorContaOutrem() {
        super();
        empresa = EMPRESA_POR_OMISSAO;
    }

    /**
     * retorna a empresa
     *
     * @return empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * modifi
     *
     * @return
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return String.format("TRABALHADOR POR CONTA OUTREM %n%s"
                + "%nEmpresa: %s ", super.toString(), empresa);
    }

    @Override
    public float obterTaxaRT() {
        return 0;
    }

    @Override
    public float obterTaxaOutrosRendimentos() {
        return 0;
    }

    public static float getEscalaoRT() {
        return escalaoRT;
    }

    public static void setEscalaoRT(float escalaoRT) {
        TrabalhadorContaOutrem.escalaoRT = escalaoRT;
    }

    /**
     * retorna a taxa rt1
     *
     * @return taxa rt1
     */
    public static float getTaxaRT1() {
        return taxaRT1;
    }

    /**
     * modifica a taxa rt1
     *
     * @param taxaRT1
     */
    public static void setTaxaRT1(float taxaRT1) {
        TrabalhadorContaOutrem.taxaRT1 = taxaRT1;
    }

    /**
     * retorna a taxa rt2
     *
     * @return taxa rt2
     */
    public static float getTaxaRT2() {
        return taxaRT2;
    }

    /**
     * modifica a taxa rt2
     *
     * @param taxaRT2
     */
    public static void setTaxaRT2(float taxaRT2) {
        TrabalhadorContaOutrem.taxaRT2 = taxaRT2;
    }

    /**
     * retorna a taxa or
     *
     * @return taxa or
     */
    public static float getTaxaOR() {
        return taxaOR;
    }

    /**
     * modifica a taxa or
     *
     * @param taxaOR
     */
    public static void setTaxaOR(float taxaOR) {
        TrabalhadorContaOutrem.taxaOR = taxaOR;
    }
}
