package br.com.cz.delivery.exceptions;

public class QuantidadeEntregasException extends RuntimeException {
    public QuantidadeEntregasException() {
        super("A quantidade de entregas não pode ser 0 ou menor");
    }
}
