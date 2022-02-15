package pl4a;

/**
 * @author Luís Araújo
 */
public class TarifarioSimples extends ContadorEletrico {
    /**
     * potencia contratada
     */
    private static float potenciaContratada = 6.9f;
    /**
     * custo se potencia<6.9
     */
    private static float custoMenor = 0.13f;
    /**
     * custo se potencia>=6.9
     */
    private static float custoMaior = 0.16f;
    private static final float POTENCIA_POR_OMISSAO = 0f;

    /**
     * construtor completo
     *
     * @param nome_cliente
     * @param consumo
     * @param potencia
     */
    public TarifarioSimples(String nome_cliente, int consumo, float potencia) {
        super(nome_cliente, consumo);
        this.potenciaContratada = potencia;
    }

    public TarifarioSimples(String nome_cliente, float potencia) {
        super(nome_cliente);
        this.potenciaContratada = potencia;
    }

    public TarifarioSimples(String nome_cliente) {
        super(nome_cliente);
        potenciaContratada = POTENCIA_POR_OMISSAO;
    }

    public TarifarioSimples(float potencia) {
        super();
        this.potenciaContratada = potencia;
    }

    /**
     * construtor vazio
     */
    public TarifarioSimples() {
        super();
        potenciaContratada = POTENCIA_POR_OMISSAO;
    }

    public String toString() {
        return String.format("%s Consumo: %d", super.toString(), super.getConsumo());
    }

    @Override
    public float calcularCusto() {
        return determinarCustoKwHora() * getConsumo();
    }

    /**
     * retorna a potencia limite
     *
     * @return potencia limite
     */
    public static double getPotLimite() {
        return TarifarioSimples.potenciaContratada;
    }

    /**
     * retorna o custo menor
     *
     * @return custo menor
     */
    public static double getCustoMenor() {
        return TarifarioSimples.custoMenor;
    }

    /**
     * retorna o custo maior
     *
     * @return custo maior
     */
    public static double getCustoMaior() {
        return TarifarioSimples.custoMaior;
    }

    /**
     * modifica a potencia contratada
     *
     * @param potLimite
     */
    public static void setPotLimite(float potLimite) {
        TarifarioSimples.potenciaContratada = potenciaContratada;
    }

    /**
     * modifica o custo menor
     *
     * @param custoMenor
     */
    public static void setCustoMenor(float custoMenor) {
        TarifarioSimples.custoMenor = custoMenor;
    }

    /**
     * modifica o custo maior
     *
     * @param custoMaior
     */
    public static void setCustoMaior(float custoMaior) {
        TarifarioSimples.custoMaior = custoMaior;
    }

    private float determinarCustoKwHora() {
        return (potenciaContratada < POTENCIA_POR_OMISSAO) ? custoMenor : custoMaior;
    }
}

