package br.com.cz.delivery.exceptions;

public class RecebimentoSalarioException extends RuntimeException {
    public RecebimentoSalarioException() {
        super("Não é possível receberSalario um salário 0 ou negativo.");
    }
}
