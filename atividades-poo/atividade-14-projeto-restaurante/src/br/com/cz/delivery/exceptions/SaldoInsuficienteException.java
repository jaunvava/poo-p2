package br.com.cz.delivery.exceptions;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente.");
    }
}
