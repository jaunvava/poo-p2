package br.com.cz.delivery.exceptions;

public class SemEntregadorException extends RuntimeException {
    public SemEntregadorException() {
        super("Restaurante sem entregador.");
    }
}
