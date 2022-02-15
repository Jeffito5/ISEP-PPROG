package pl4b;

import javax.swing.*;

/**
 * @author Luís Araújo
 */
public class Professor extends MembroEscolar implements Salario {
    /**
     * categoria de professor
     */
    private String categoria;
    /**
     * categoria por omissão
     */
    private static final String CATEGORIA_POR_OMISSAO = "Sem categoria";

    /**
     * construtor completo
     *
     * @param nome
     * @param numIdentCivil
     * @param categoria
     */
    public Professor(String nome, int numIdentCivil, String categoria) {
        super(nome, numIdentCivil);
        this.categoria = categoria;
    }

    /**
     * construtor vazio
     */
    public Professor() {
        super();
        categoria = CATEGORIA_POR_OMISSAO;
    }

    /**
     * retorna a categoria
     *
     * @return categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * modifica a categoria
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Categoria: %s%n", super.toString(), categoria);
    }

    @Override
    public float calcularSalario() {
        return this.getCategoria() == "Adjunto" ? Professor.salarioBase + Professor.salarioBase * Professor.majoracaoAdjunto :
                this.getCategoria() == "Coordenador" ? Professor.salarioBase + Professor.salarioBase * Professor.majoracaoCoordenador :
                        Professor.salarioBase;
    }
}
