package pl4a;

/**
 * @author Luís Araújo
 */
public class ContadorGas extends Contador {
    /**
     * custo
     */
    private static float custo = 0.8f;
    /**
     * número do contador do gás
     */
    private static int numContGas = 0;
    /**
     * id do contador do gás
     */
    private static final String id = "GAS-";

    /**
     * construtor completo
     *
     * @param nome_cliente
     * @param consumo
     */
    public ContadorGas(String nome_cliente, int consumo) {
        super(ContadorGas.id + (ContadorGas.numContGas++), nome_cliente, consumo);
    }

    public ContadorGas(String nome_cliente) {
        super(ContadorGas.id + (ContadorGas.numContGas++), nome_cliente,0);
    }

    public ContadorGas(int consumo) {
        super(ContadorGas.id + (ContadorGas.numContGas++), consumo);
    }

    /**
     * construtor vazio
     */
    public ContadorGas() {
        super(ContadorGas.id + (ContadorGas.numContGas++));
    }

    /**
     * retorna o número do contador
     *
     * @return número do contador
     */
    public static int getNumContGas() {
        return numContGas;
    }

    /**
     * modifica o número do contador do gás
     *
     * @param numContGas
     */
    public static void setNumContGas(int numContGas) {
        ContadorGas.numContGas = numContGas;
    }

    /**
     * calcula o custo do consumo
     *
     * @return custo do consumo
     */

    public float calcularCusto() {
        return ContadorGas.custo * super.getConsumo();

    }

    /**
     * retorna o custo
     *
     * @return custo
     * @param custoM3
     */
    public static double getCustoUnitario(float custoM3) {
        return ContadorGas.custo;
    }

    /**
     * modifica o custo
     *
     * @param custoUnitario
     */
    public static void setCustoUnitario(float custoUnitario) {
        ContadorGas.custo = custoUnitario;
    }
}

