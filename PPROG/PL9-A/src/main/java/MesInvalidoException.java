/**
 * @author Luís Araújo
 */
public class MesInvalidoException extends IllegalArgumentException {
    public MesInvalidoException() {
        super("Mês inválido!");
    }

    public MesInvalidoException(String mensagem) {
        super(mensagem);
    }
}

