package pl4b;

/**
 * @author Luís Araújo
 */
public class MembroEscolar {
    /**
     * nome do membro escolar
     */
    private String nome;
    /**
     * número de identificação civil
     */
    private int numIdentCivil;
    /**
     * nome por omissão
     */
    private static final String NOME_POR_OMISSAO = "Sem nome.";
    /**
     * número por omissão
     */
    private static final int NUMIDENTCIVIL_POR_OMISSAO = 0;

    /**
     * construtor completo
     *
     * @param nome
     * @param numIdentCivil
     */
    public MembroEscolar(String nome, int numIdentCivil) {
        this.nome = nome;
        this.numIdentCivil = numIdentCivil;
    }

    /**
     * construtor vazio
     */
    public MembroEscolar() {
        nome = NOME_POR_OMISSAO;
        numIdentCivil = NUMIDENTCIVIL_POR_OMISSAO;
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
     * retorna o número de identificação civil
     *
     * @return
     */
    public int getNumIdentCivil() {
        return numIdentCivil;
    }

    /**
     * modifica o nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * modifica o número de identificação civil
     *
     * @param numIdentCivil
     */
    public void setNumIdentCivil(int numIdentCivil) {
        this.numIdentCivil = numIdentCivil;
    }

    public String toString() {
        return String.format("Membro escolar: %s%n"
                + "Número de identificação civil: %d%n", nome, numIdentCivil);
    }
}
