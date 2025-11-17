package DAO;

import java.util.ArrayList;
import java.util.UUID;

public interface InterfaceDAO<T> {
    boolean inserirT (T objeto);

    ArrayList<T> buscarTodos();

    T buscarPorId(UUID id);

    boolean atualizar(UUID id, T novoObjeto);

    boolean remover(UUID id);

}