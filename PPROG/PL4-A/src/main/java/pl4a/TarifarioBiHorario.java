package pl4a;

/**
 * @author Luís Araújo
 */
public class TarifarioBiHorario extends ContadorEletrico {
    /**
     * consumo fora de vazio
     */
    private int consumoVazio;
    private static final int CONSUMO_VAZIO_POR_OMISSAO = 0;
    /**
     * custo nas horas de vazio
     */
    private static float custoVazio = 0.066f;
    /**
     * custo nas horas de vazio
     */
    private static float custoForaVazio = 0.14f;


    public TarifarioBiHorario(String nome_cliente, int consumoVazio, int consumoForaVazio) {
        super(nome_cliente, consumoForaVazio);
        this.consumoVazio = consumoVazio;
    }

    public TarifarioBiHorario(int consumoVazio, int consumoForaVazio) {
        super(consumoForaVazio);
        this.consumoVazio = consumoVazio;
    }

    /**
     * construtor vazio
     */
    public TarifarioBiHorario(String nome_cliente) {
        super(nome_cliente);
    }

    public TarifarioBiHorario() {
        super();
    }

    /**
     * retorna o consumo fora das horas de vazio
     *
     * @return consumo fora das horas de vazio
     */
    public int getConsumoVazio() {
        return this.consumoVazio;
    }

    /**
     * modifica o consumo fora das horas de vazio
     *
     * @param consumoVazio
     */
    public void setConsumoVazio(int consumoVazio) {
        this.consumoVazio = consumoVazio;
    }


    @Override
    public String toString() {
        return String.format("%s Consumo Vazio: %d Consumo Fora do Vazio: %d",
                super.toString(), super.getConsumo(), this.getConsumoVazio());
    }

    @Override
    public float calcularCusto() {
        return super.getConsumo() * TarifarioBiHorario.getCustoVazio()
                + this.getConsumoVazio() * TarifarioBiHorario.getCustoForaVazio();
    }

    /**
     * retorna o custo nas horas de vazio
     *
     * @return custo nas horas de vazio
     */
    public static float getCustoVazio() {
        return TarifarioBiHorario.custoVazio;
    }

    /**
     * retorna o custo nas horas de não vazio
     *
     * @return custo nas horas de não vazio
     */
    public static float getCustoForaVazio() {
        return TarifarioBiHorario.custoForaVazio;
    }

    /**
     * modifica o custo nas horas de vazio
     *
     * @param custoVazio
     */
    public static void setCustoVazio(float custoVazio) {
        TarifarioBiHorario.custoVazio = custoVazio;
    }

    /**
     * modifica o custo nas horas de não vazio
     *
     * @param custoForaVazio
     */
    public static void setCustoForaVazio(float custoForaVazio) {
        TarifarioBiHorario.custoForaVazio = custoForaVazio;
    }
}
