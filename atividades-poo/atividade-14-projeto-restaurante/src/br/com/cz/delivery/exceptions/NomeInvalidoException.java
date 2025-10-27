package br.com.cz.delivery.exceptions;

public class NomeInvalidoException extends RuntimeException {
    public NomeInvalidoException() {
        super("O nome deve ter 3 ou mais caracteres.");
    }
}
