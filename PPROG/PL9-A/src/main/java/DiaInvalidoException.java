/**
 * @author Luís Araújo
 */
public class DiaInvalidoException extends IllegalArgumentException {
    public DiaInvalidoException() {
        super("Dia inválido!");
    }

    public DiaInvalidoException(String mensagem) {
        super(mensagem);
    }

}