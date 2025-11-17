package Interface;

import java.util.List;

public interface IDAO<T> {
    void criar(T entidade) throws Exception;
    T buscarPorId(int id) throws Exception;
    List<T> listarTodos() throws Exception;
    void atualizar(T entidade) throws Exception;
    void deletar(int id) throws Exception;
}
