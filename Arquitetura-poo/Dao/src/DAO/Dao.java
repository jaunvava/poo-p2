package DAO;

import java.util.ArrayList;
import java.util.UUID;

public class Dao<T extends InterfaceId> implements InterfaceDAO<T>{
    ArrayList<T> base = new ArrayList<>();


    @Override
    public boolean inserirT(T objeto) {
        return base.add(objeto);
    }

    @Override
    public ArrayList<T> buscarTodos() {
        return this.base;
    }

    @Override
    public T buscarPorId(UUID id) {
        for (int i = 0; i < this.base.size(); i++){
            if (this.base.get(i).getId().equals(id))
                return this.base.get(i);
        }
        return null;
    }

    @Override
    public boolean atualizar(UUID id, T novoObjeto) {
        for (int i = 0; i < this.base.size(); i++){
            if (this.base.get(i).getId().equals(id)) {
                this.base.set(i, novoObjeto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(UUID id) {
        for (int i = 0; i < this.base.size(); i++){
            if (this.base.get(i).getId().equals(id)){
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }
}