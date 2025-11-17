package Exception;

public class ZoologicoException extends Exception {
    public ZoologicoException(String mensagem) {
        super(mensagem);
    }

    public ZoologicoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
