package Controller;

import DAO.InterfaceDAO;
import Models.Pessoa;
import Models.PessoaDao;

import java.util.ArrayList;
import java.util.UUID;

public class PessoaController implements InterfaceDAO<Pessoa> {

    private PessoaDao dao = new PessoaDao();

    // Cadastrar pessoa com nome 3 ou mais caracteres
    public boolean inserirPessoa(Pessoa objeto) {
        if (objeto.getNome().length() >= 3) {
            dao.inserirT(objeto);
            return true;
        }
        return false;
    }

    @Override
    public boolean inserirT(Pessoa objeto) {
        // Método da interface, mas aqui o controle de inserção está no inserirPessoa()
        return inserirPessoa(objeto);
    }

    @Override
    public ArrayList<Pessoa> buscarTodos() {
        return this.dao.buscarTodos();
    }

    @Override
    public Pessoa buscarPorId(UUID id) {
        if (id != null) {
            return this.dao.buscarPorId(id); // Corrigido (antes chamava o próprio método)
        }
        return null;
    }

    @Override
    public boolean atualizar(UUID id, Pessoa novoObjeto) {
        if (id == null) {
            return false;
        }
        if (novoObjeto.getNome().length() < 3) {
            return false;
        }
        return this.dao.atualizar(id, novoObjeto);
    }

    @Override
    public boolean remover(UUID id) {
        if (id == null) {
            return false;
        }
        return this.dao.remover(id);
    }


    public ArrayList<Pessoa> retornarTodos() {
        return this.dao.buscarTodos();
    }
}