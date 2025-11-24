package DAO;

import java.util.ArrayList;
import java.util.List;

public class DAO<T> implements IDAO<T> {
    private ArrayList<T> database;

    public DAO() {
        this.database = new ArrayList<>();
    }

    @Override
    public boolean inserir(T object) {
        return database.add(object);
    }

    @Override
    public T buscar(int id) {
        if (id >= 0 && id < database.size()) {
            return database.get(id);
        }
        return null;
    }

    @Override
    public List<T> retornarTodos() {
        return new ArrayList<>(database);
    }

    @Override
    public void remover(int id) {
        if (id >= 0 && id < database.size()) {
            database.remove(id);
        }
    }

    @Override
    public void atualizar(int id, T object) {
        if (id >= 0 && id < database.size()) {
            database.set(id, object);
        }
    }
}
