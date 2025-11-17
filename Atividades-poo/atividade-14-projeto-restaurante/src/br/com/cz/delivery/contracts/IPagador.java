package br.com.cz.delivery.contracts;

public interface IPagador {
    boolean pagar(int valor);
    double getSaldo();
}
