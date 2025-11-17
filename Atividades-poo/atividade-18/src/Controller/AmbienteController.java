package Controller;

import DAO.AmbienteDAO;
import Exception.AmbienteException;
import Interface.IController;
import Model.Ambiente;
import Model.Animal;

import java.util.List;

public class AmbienteController implements IController<Ambiente> {
    private AmbienteDAO ambienteDAO;

    public AmbienteController() {
        this.ambienteDAO = new AmbienteDAO();
    }

    public AmbienteController(AmbienteDAO ambienteDAO) {
        this.ambienteDAO = ambienteDAO;
    }

    @Override
    public void adicionar(Ambiente ambiente) throws AmbienteException {
        try {
            validarAmbiente(ambiente);
            ambienteDAO.criar(ambiente);
            System.out.println("Ambiente adicionado com sucesso: " + ambiente.getTipoAmbiente());
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao adicionar ambiente: " + e.getMessage(), e);
        }
    }

    @Override
    public Ambiente buscar(int id) throws AmbienteException {
        try {
            return ambienteDAO.buscarPorId(id);
        } catch (Exception e) {
            throw new AmbienteException("Erro ao buscar ambiente: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Ambiente> listar() throws AmbienteException {
        try {
            return ambienteDAO.listarTodos();
        } catch (Exception e) {
            throw new AmbienteException("Erro ao listar ambientes: " + e.getMessage(), e);
        }
    }

    @Override
    public void atualizar(Ambiente ambiente) throws AmbienteException {
        try {
            validarAmbiente(ambiente);
            ambienteDAO.atualizar(ambiente);
            System.out.println("Ambiente atualizado com sucesso: " + ambiente.getTipoAmbiente());
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao atualizar ambiente: " + e.getMessage(), e);
        }
    }

    @Override
    public void remover(int id) throws AmbienteException {
        try {
            Ambiente ambiente = ambienteDAO.buscarPorId(id);
            ambienteDAO.deletar(id);
            System.out.println("Ambiente removido com sucesso: " + ambiente.getTipoAmbiente());
        } catch (Exception e) {
            throw new AmbienteException("Erro ao remover ambiente: " + e.getMessage(), e);
        }
    }

    public void adicionarAnimal(int ambienteId, Animal animal) throws AmbienteException {
        try {
            if (animal == null) {
                throw new AmbienteException("Animal não pode ser nulo.");
            }
            
            Ambiente ambiente = ambienteDAO.buscarPorId(ambienteId);
            
            if (!ambiente.temEspaco()) {
                throw new AmbienteException("Ambiente não tem espaço disponível. Capacidade máxima: " 
                        + ambiente.getCapacidade());
            }
            
            ambiente.adicionarAnimal(animal);
            ambienteDAO.atualizar(ambiente);
            System.out.println("Animal " + animal.getNome() + " adicionado ao ambiente " + ambiente.getTipoAmbiente());
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao adicionar animal ao ambiente: " + e.getMessage(), e);
        }
    }

    public void removerAnimal(int ambienteId, Animal animal) throws AmbienteException {
        try {
            if (animal == null) {
                throw new AmbienteException("Animal não pode ser nulo.");
            }
            
            Ambiente ambiente = ambienteDAO.buscarPorId(ambienteId);
            ambiente.removerAnimal(animal);
            ambienteDAO.atualizar(ambiente);
            System.out.println("Animal " + animal.getNome() + " removido do ambiente " + ambiente.getTipoAmbiente());
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao remover animal do ambiente: " + e.getMessage(), e);
        }
    }

    public List<Ambiente> buscarPorTipo(String tipo) throws AmbienteException {
        try {
            if (tipo == null || tipo.trim().isEmpty()) {
                throw new AmbienteException("Tipo para busca não pode ser vazio.");
            }
            return ambienteDAO.buscarPorTipo(tipo);
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao buscar ambientes por tipo: " + e.getMessage(), e);
        }
    }

    public List<Ambiente> buscarAmbientesDisponiveis() throws AmbienteException {
        try {
            return ambienteDAO.buscarAmbientesDisponiveis();
        } catch (Exception e) {
            throw new AmbienteException("Erro ao buscar ambientes disponíveis: " + e.getMessage(), e);
        }
    }

    public void exibirInformacoes(int id) throws AmbienteException {
        try {
            Ambiente ambiente = ambienteDAO.buscarPorId(id);
            System.out.println("\n=== Informações do Ambiente ===");
            System.out.println("ID: " + ambiente.getId());
            System.out.println("Tipo: " + ambiente.getTipoAmbiente());
            System.out.println("Capacidade: " + ambiente.getCapacidade());
            System.out.println("Área: " + ambiente.getArea() + " m²");
            System.out.println("Temperatura: " + ambiente.getTemperatura() + "°C");
            System.out.println("Animais: " + ambiente.getQuantidadeAnimais() + "/" + ambiente.getCapacidade());
            System.out.println("Espaço disponível: " + (ambiente.temEspaco() ? "Sim" : "Não"));
            
            if (!ambiente.getAnimais().isEmpty()) {
                System.out.println("\nAnimais no ambiente:");
                for (Animal animal : ambiente.getAnimais()) {
                    System.out.println("  - " + animal.getNome() + " (" + animal.getEspecie() + ")");
                }
            }
            System.out.println("================================\n");
        } catch (AmbienteException e) {
            throw e;
        } catch (Exception e) {
            throw new AmbienteException("Erro ao exibir informações do ambiente: " + e.getMessage(), e);
        }
    }

    private void validarAmbiente(Ambiente ambiente) throws AmbienteException {
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
    }
}
