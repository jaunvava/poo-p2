package br.com.cz.delivery.contracts;

import br.com.cz.delivery.exceptions.RecursoNaoImplementadoException;

import java.util.ArrayList;
import java.util.UUID;

public interface ICRUD {
    boolean inserir(Object obj);

    ArrayList<Object> retornarTodos();
    default Object retornarPorId(int id){
        throw new RecursoNaoImplementadoException();
    }
    default Object retornarPorId(UUID id){
        throw new RecursoNaoImplementadoException();
    }
    ArrayList<Object> buscarPorNome(String nome);

    default boolean atualizar(int id, Object obj){
        throw new RecursoNaoImplementadoException();
    }
    default boolean atualizar(UUID id, Object obj){
        throw new RecursoNaoImplementadoException();
    }

    default boolean removerPorId(int id){
        throw new RecursoNaoImplementadoException();
    }
    default boolean removerPorId(UUID uuid){
        throw new RecursoNaoImplementadoException();
    }

}
