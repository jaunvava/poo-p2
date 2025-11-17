package DAO;

import Exception.AmbienteException;
import Interface.IDAO;
import Model.Ambiente;

import java.util.ArrayList;
import java.util.List;

public class AmbienteDAO implements IDAO<Ambiente> {
    private List<Ambiente> ambientes;
    private int proximoId;

    public AmbienteDAO() {
        this.ambientes = new ArrayList<>();
        this.proximoId = 1;
    }

    @Override
    public void criar(Ambiente ambiente) throws AmbienteException {
        try {
            if (ambiente == null) {
                throw new AmbienteException("Ambiente não pode ser nulo.");
            }
            if (ambiente.getTipoAmbiente() == null || ambiente.getTipoAmbiente().trim().isEmpty()) {
                throw new AmbienteException("Tipo de ambiente é obrigatório.");
            }
            if (ambiente.getCapacidade() <= 0) {
                throw new AmbienteException("Capacidade do ambiente deve ser maior que zero.");
            }
            if (ambiente.getArea() <= 0) {
                throw new AmbienteException("Área do ambiente deve ser maior que zero.");
            }
            
            ambiente.setId(proximoId++);
            ambientes.add(ambiente);
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao criar ambiente: " + e.getMessage(), e);
        }
    }

    @Override
    public Ambiente buscarPorId(int id) throws AmbienteException {
        try {
            for (Ambiente ambiente : ambientes) {
                if (ambiente.getId() == id) {
                    return ambiente;
                }
            }
            throw new AmbienteException("Ambiente com ID " + id + " não encontrado.");
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao buscar ambiente: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Ambiente> listarTodos() throws AmbienteException {
        try {
            return new ArrayList<>(ambientes);
        } catch (Exception e) {
            throw new AmbienteException("Erro ao listar ambientes: " + e.getMessage(), e);
        }
    }

    @Override
    public void atualizar(Ambiente ambiente) throws AmbienteException {
        try {
            if (ambiente == null) {
                throw new AmbienteException("Ambiente não pode ser nulo.");
            }
            
            boolean encontrado = false;
            for (int i = 0; i < ambientes.size(); i++) {
                if (ambientes.get(i).getId() == ambiente.getId()) {
                    // Verifica se a nova capacidade não é menor que a quantidade atual de animais
                    if (ambiente.getCapacidade() < ambiente.getQuantidadeAnimais()) {
                        throw new AmbienteException("A capacidade não pode ser menor que a quantidade atual de animais (" 
                                + ambiente.getQuantidadeAnimais() + ").");
                    }
                    ambientes.set(i, ambiente);
                    encontrado = true;
                    break;
                }
            }
            
            if (!encontrado) {
                throw new AmbienteException("Ambiente com ID " + ambiente.getId() + " não encontrado para atualização.");
            }
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao atualizar ambiente: " + e.getMessage(), e);
        }
    }

    @Override
    public void deletar(int id) throws AmbienteException {
        try {
            Ambiente ambiente = buscarPorId(id);
            
            if (!ambiente.getAnimais().isEmpty()) {
                throw new AmbienteException("Não é possível deletar o ambiente. Remova todos os animais primeiro.");
            }
            
            ambientes.remove(ambiente);
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao deletar ambiente: " + e.getMessage(), e);
        }
    }

    public List<Ambiente> buscarPorTipo(String tipo) throws AmbienteException {
        try {
            List<Ambiente> resultado = new ArrayList<>();
            for (Ambiente ambiente : ambientes) {
                if (ambiente.getTipoAmbiente().toLowerCase().contains(tipo.toLowerCase())) {
                    resultado.add(ambiente);
                }
            }
            return resultado;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao buscar ambientes por tipo: " + e.getMessage(), e);
        }
    }

    public List<Ambiente> buscarAmbientesDisponiveis() throws AmbienteException {
        try {
            List<Ambiente> resultado = new ArrayList<>();
            for (Ambiente ambiente : ambientes) {
                if (ambiente.temEspaco()) {
                    resultado.add(ambiente);
                }
            }
            return resultado;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao buscar ambientes disponíveis: " + e.getMessage(), e);
        }
    }
}
