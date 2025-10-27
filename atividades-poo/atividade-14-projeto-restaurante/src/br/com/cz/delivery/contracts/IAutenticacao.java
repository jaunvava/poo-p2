package br.com.cz.delivery.contracts;

public interface IAutenticacao {

    boolean login(String senha);
    boolean logout();

}
