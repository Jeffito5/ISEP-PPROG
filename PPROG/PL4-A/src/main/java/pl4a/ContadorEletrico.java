package pl4a;

/**
 * @author Luís Araújo
 */
public abstract class ContadorEletrico extends Contador {
    /**
     * número do contador
     */
    private static int numContElect = 0;
    /**
     * id do contador
     */
    private static final String id = "ELECT-";

    /**
     * construtor completo
     *
     * @param nome_cliente
     * @param consumo
     */
    public ContadorEletrico(String nome_cliente, int consumo) {
        super(ContadorEletrico.id + (ContadorEletrico.numContElect++), nome_cliente, consumo);
    }

    public ContadorEletrico(String nome_cliente) {
        super(ContadorEletrico.id + (ContadorEletrico.numContElect++), nome_cliente,0);
    }

    public ContadorEletrico(int consumo) {
        super(ContadorEletrico.id + (ContadorEletrico.numContElect++), consumo);
    }

    /**
     * construtor vazio
     */
    public ContadorEletrico() {
        super(ContadorEletrico.id + (ContadorEletrico.numContElect++));
    }

    @Override
    public String toString() {
        return String.format("%s Potência contradada: %.1f", super.toString());
    }

    /**
     * retorna o número do contador
     *
     * @return número do contador
     */
    public static int getNumContador() {
        return ContadorEletrico.numContElect;
    }

    @Override
    public abstract float calcularCusto();
}

