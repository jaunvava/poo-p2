package DAO;

import Exception.ZoologicoException;
import Interface.IDAO;
import Model.Zoologico;

import java.util.ArrayList;
import java.util.List;

public class ZoologicoDAO implements IDAO<Zoologico> {
    private List<Zoologico> zoologicos;
    private int proximoId;

    public ZoologicoDAO() {
        this.zoologicos = new ArrayList<>();
        this.proximoId = 1;
    }

    @Override
    public void criar(Zoologico zoologico) throws ZoologicoException {
        try {
            if (zoologico == null) {
                throw new ZoologicoException("Zoológico não pode ser nulo.");
            }
            if (zoologico.getNome() == null || zoologico.getNome().trim().isEmpty()) {
                throw new ZoologicoException("Nome do zoológico é obrigatório.");
            }
            
            // Verifica se já existe um zoológico com o mesmo nome
            for (Zoologico z : zoologicos) {
                if (z.getNome().equalsIgnoreCase(zoologico.getNome())) {
                    throw new ZoologicoException("Já existe um zoológico com o nome: " + zoologico.getNome());
                }
            }
            
            zoologico.setId(proximoId++);
            zoologicos.add(zoologico);
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao criar zoológico: " + e.getMessage(), e);
        }
    }

    @Override
    public Zoologico buscarPorId(int id) throws ZoologicoException {
        try {
            for (Zoologico zoologico : zoologicos) {
                if (zoologico.getId() == id) {
                    return zoologico;
                }
            }
            throw new ZoologicoException("Zoológico com ID " + id + " não encontrado.");
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao buscar zoológico: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Zoologico> listarTodos() throws ZoologicoException {
        try {
            return new ArrayList<>(zoologicos);
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao listar zoológicos: " + e.getMessage(), e);
        }
    }

    @Override
    public void atualizar(Zoologico zoologico) throws ZoologicoException {
        try {
            if (zoologico == null) {
                throw new ZoologicoException("Zoológico não pode ser nulo.");
            }
            
            boolean encontrado = false;
            for (int i = 0; i < zoologicos.size(); i++) {
                if (zoologicos.get(i).getId() == zoologico.getId()) {
                    zoologicos.set(i, zoologico);
                    encontrado = true;
                    break;
                }
            }
            
            if (!encontrado) {
                throw new ZoologicoException("Zoológico com ID " + zoologico.getId() + " não encontrado para atualização.");
            }
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao atualizar zoológico: " + e.getMessage(), e);
        }
    }

    @Override
    public void deletar(int id) throws ZoologicoException {
        try {
            Zoologico zoologico = buscarPorId(id);
            
            if (!zoologico.getAmbientes().isEmpty()) {
                throw new ZoologicoException("Não é possível deletar o zoológico. Remova todos os ambientes primeiro.");
            }
            
            zoologicos.remove(zoologico);
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao deletar zoológico: " + e.getMessage(), e);
        }
    }

    public List<Zoologico> buscarPorNome(String nome) throws ZoologicoException {
        try {
            List<Zoologico> resultado = new ArrayList<>();
            for (Zoologico zoologico : zoologicos) {
                if (zoologico.getNome().toLowerCase().contains(nome.toLowerCase())) {
                    resultado.add(zoologico);
                }
            }
            return resultado;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao buscar zoológicos por nome: " + e.getMessage(), e);
        }
    }
}
