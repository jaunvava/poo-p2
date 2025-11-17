package Interface;

import java.util.List;

public interface IController<T> {
    void adicionar(T entidade) throws Exception;
    T buscar(int id) throws Exception;
    List<T> listar() throws Exception;
    void atualizar(T entidade) throws Exception;
    void remover(int id) throws Exception;
}
