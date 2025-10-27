package br.com.cz.delivery.contracts;

public interface IRecebedor {
    boolean receberSalario(int valor);
    double getSaldo();
}
