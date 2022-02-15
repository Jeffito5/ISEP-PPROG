package pl6;

import java.util.Objects;

/**
 * @author Luís Araújo
 */
public class TrabalhadorContaPropria extends ContribuinteComRT {
    /**
     * profissao
     */
    private String profissao;
    /**
     * profissao por omissao
     */
    private static final String PROFISSAO_POR_OMISSAO = "sem profissão.";
    /**
     * escalao rt
     */
    private static float escalaoOR = 50000;
    /**
     * taxa rt
     */
    private static float taxaRT = 3;
    /**
     * taxa or1
     */
    private static float taxaOR1 = 2;
    /**
     * taxa or2
     */
    private static float taxaOR2 = 5;

    /**
     * construtor completo
     *
     * @param nome
     * @param morada
     * @param OR
     * @param RT
     * @param profissao
     */
    public TrabalhadorContaPropria(String nome, String morada, float OR, float RT, String profissao) {
        super(nome, morada, OR, RT);
        this.profissao = profissao;
    }

    /**
     * construtor vazio
     */
    public TrabalhadorContaPropria() {
        super();
        profissao = PROFISSAO_POR_OMISSAO;
    }

    /**
     * retorna a profissao
     *
     * @return profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * modifica a profissao
     *
     * @param profissao
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return String.format("TRABALHADOR POR CONTA PROPRIA %n%s"
                + "%nProfissao: %s\n", super.toString(), profissao);
    }

    @Override
    public float obterTaxaRT() {
        return 0;
    }

    @Override
    public float obterTaxaOutrosRendimentos() {
        return 0;
    }

    /**
     * retorna o escalao or
     * @return escalao or
     */
    public static float getEscalaoOR() {
        return escalaoOR;
    }

    /**
     * retorna a taxa rt
     * @return taxa rt
     */
    public static float getTaxaRT() {
        return taxaRT;
    }

    /**
     * retorna a taxa or1
     * @return taxa or1
     */
    public static float getTaxaOR1() {
        return taxaOR1;
    }

    /**
     * retorna a taxa or2
     * @return toxa or2
     */
    public static float getTaxaOR2() {
        return taxaOR2;
    }

    /**
     * modifica  o escalao or
     * @param escalaoOR
     */
    public static void setEscalaoOR(float escalaoOR) {
        TrabalhadorContaPropria.escalaoOR = escalaoOR;
    }

    /**
     * modifica a taxa rt
     * @param taxaRT
     */
    public static void setTaxaRT(float taxaRT) {
        TrabalhadorContaPropria.taxaRT = taxaRT;
    }

    /**
     * modifica a taxa or1
     * @param taxaOR1
     */
    public static void setTaxaOR1(float taxaOR1) {
        TrabalhadorContaPropria.taxaOR1 = taxaOR1;
    }

    /**
     * modifica a taxa or2
     * @param taxaOR2
     */
    public static void setTaxaOR2(float taxaOR2) {
        TrabalhadorContaPropria.taxaOR2 = taxaOR2;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)){
            return false;
        }
        TrabalhadorContaPropria tcp = (TrabalhadorContaPropria) o;
        return Objects.equals(profissao, tcp.profissao);
    }

}

