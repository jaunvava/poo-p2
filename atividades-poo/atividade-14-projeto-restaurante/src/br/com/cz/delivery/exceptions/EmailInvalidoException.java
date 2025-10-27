package br.com.cz.delivery.exceptions;

public class EmailInvalidoException extends RuntimeException {
    public EmailInvalidoException() {
        super("O e-mail não é válido.");
    }
}
