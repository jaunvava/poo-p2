package br.com.cz.delivery.exceptions;

public class RecursoNaoImplementadoException extends RuntimeException {
    public RecursoNaoImplementadoException() {
        super("Não implementado");
    }
}
