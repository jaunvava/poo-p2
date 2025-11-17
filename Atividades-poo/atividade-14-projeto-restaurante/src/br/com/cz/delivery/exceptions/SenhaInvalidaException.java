package br.com.cz.delivery.exceptions;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException() {
        super("A senha informada é inválida, deve conter 8 ou mais caracteres.");
    }
}
