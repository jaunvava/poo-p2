package br.com.cz.delivery.exceptions;

public class AutenticacaoException extends RuntimeException {
    public AutenticacaoException(){
        super("As credenciais estão inválidas.");
    }
}
