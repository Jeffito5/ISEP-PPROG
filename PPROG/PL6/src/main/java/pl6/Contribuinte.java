package pl6;

import java.util.Objects;

/**
 * @author Luís Araújo
 */
public abstract class Contribuinte {
    /**
     * O nome do contribuinte.
     */
    private String nome;
    /**
     * Morada do contribuinte
     */
    private String morada;
    /**
     * Outros rendimentos
     */
    private float outrosRendimentos;
    /**
     * Nome por omissão
     */
    private final static String NOME_POR_OMISSAO = "Sem nome.";
    /**
     * Morada por omissão
     */
    private final static String MORADA_POR_OMISSAO = "Sem morada.";
    /**
     * Outros rendimentos por omissão
     */
    private final static float OR_POR_OMISSAO = 0;

    /**
     * Contribuinte sem parametros.
     */
    public Contribuinte() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        outrosRendimentos = OR_POR_OMISSAO;
    }

    /**
     * construtor com todos os parâmetros
     *
     * @param nome
     * @param morada
     * @param OR
     */
    public Contribuinte(String nome, String morada, float OR) {
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = OR;
    }

    /**
     * retorna o nome
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * retorna a morada
     *
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * retorna os OR
     *
     * @return OR
     */
    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * set à morada
     *
     * @param morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * set aos OR
     *
     * @param outrosRendimentos
     */
    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nMorada: %s \nOutros rendimentos: %.2f \n", nome, morada, outrosRendimentos);
    }

    public abstract float calcularImposto();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Contribuinte oc = (Contribuinte) o;
        return Float.compare(oc.outrosRendimentos, outrosRendimentos) == 0 && nome.equals(oc.nome) && morada.equals(oc.morada);
    }

}


