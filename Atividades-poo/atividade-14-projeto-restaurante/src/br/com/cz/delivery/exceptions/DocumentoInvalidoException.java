package br.com.cz.delivery.exceptions;

public class DocumentoInvalidoException extends RuntimeException {
    public DocumentoInvalidoException() {
        super("O documento está no formato inválido.");
    }
}
