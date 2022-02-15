package pl4b;

/**
 * @author Luís Araújo
 */
public class Aluno extends MembroEscolar implements Bolsa {
    /**
     * número mecanográfico
     */
    private int numeroMecano;
    /**
     * número por omissão
     */
    private static final int NUMERO_POR_OMISSAO = 0;
    private boolean bolsa;
    private static final boolean BOLSA_POR_OMISSAO = false;

    /**
     * construtor completo
     *
     * @param nome
     * @param numIdentCivil
     * @param numeroMecano
     * @param bolsa
     */
    public Aluno(String nome, int numIdentCivil, int numeroMecano, boolean bolsa) {
        super(nome, numIdentCivil);
        this.numeroMecano = numeroMecano;
        this.bolsa = bolsa;
    }

    /**
     * construtor completo
     *
     * @param nome
     * @param numIdentCivil
     * @param numeroMecano
     */
    public Aluno(String nome, int numIdentCivil, int numeroMecano) {
        super(nome, numIdentCivil);
        this.numeroMecano = numeroMecano;
    }

    /**
     * construtor vazio
     */
    public Aluno() {
        super();
        numeroMecano = NUMERO_POR_OMISSAO;
        bolsa = BOLSA_POR_OMISSAO;
    }

    /**
     * retorna o número
     *
     * @return número
     */

    public int getNumeroMecano() {
        return numeroMecano;
    }

    /**
     * modifica o número
     *
     * @param numeroMecano
     */
    public void setNumeroMecano(int numeroMecano) {
        this.numeroMecano = numeroMecano;
    }

    /**
     * retorna se tem bolsa ou não
     *
     * @return bolsa ou não
     */
    public boolean isBolsa() {
        return bolsa;
    }

    /**
     * modifica se tem bolsa ou não
     *
     * @param bolsa
     */
    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Número mecanográfico: %d%n", super.toString(), numeroMecano);
    }

    @Override
    public int devolveBolsa() {
        return Aluno.BOLSA;
    }
}
