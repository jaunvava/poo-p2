package Exception;

public class AmbienteException extends Exception {
    public AmbienteException(String mensagem) {
        super(mensagem);
    }

    public AmbienteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
