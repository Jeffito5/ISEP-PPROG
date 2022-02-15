package pl4a;

/**
 * @author Luís Araújo
 */
public abstract class Contador {
    /**
     * id do contador
     */
    private String id;
    /**
     * nome do cliente
     */
    private String nome_cliente;
    /**
     * consumo
     */
    private int consumo;
    /**
     * id por omissão
     */
    private final static String ID_POR_OMISSAO = "Sem ID.";
    /**
     * nome por omissão
     */
    private final static String NOME_POR_OMISSAO = "Sem nome.";
    /**
     * consumo por omissão
     */
    private final static int CONSUMO_POR_OMISSAO = 0;

    /**
     * construtor completo
     *
     * @param id
     * @param nome_cliente
     * @param consumo
     */
    public Contador(String id, String nome_cliente, int consumo) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.consumo = consumo;
    }

    /**
     * construtor só com id e consumo
     *
     * @param id
     * @param consumo
     */
    public Contador(String id, int consumo) {
        this.id = id;
        nome_cliente = NOME_POR_OMISSAO;
        this.consumo = consumo;
    }

    /**
     * construtor só com id
     *
     * @param id
     */
    public Contador(String id) {
        this.id = id;
        nome_cliente = NOME_POR_OMISSAO;
        consumo = CONSUMO_POR_OMISSAO;
    }

    /**
     * construtor vazio
     */
    public Contador() {
        id = ID_POR_OMISSAO;
        nome_cliente = NOME_POR_OMISSAO;
        consumo = CONSUMO_POR_OMISSAO;
    }

    /**
     * retorna o id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * modifica o id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * retorna o nome
     *
     * @return nome
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * modifica o nome
     *
     * @param nome_cliente
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * retorna o consumo
     *
     * @return
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * modifica o consumo
     *
     * @param consumo
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return String.format("Contador com o id: %s%n"
                + "Cliente: %s%n"
                + "CustoGas: %d%n", this.getId(), this.getNome_cliente(), this.getConsumo());
    }

    public abstract float calcularCusto();
}
