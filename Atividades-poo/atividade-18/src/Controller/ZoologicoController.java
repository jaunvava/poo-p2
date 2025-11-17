package Controller;

import DAO.ZoologicoDAO;
import Exception.ZoologicoException;
import Interface.IController;
import Model.Ambiente;
import Model.Zoologico;

import java.util.List;

public class ZoologicoController implements IController<Zoologico> {
    private ZoologicoDAO zoologicoDAO;

    public ZoologicoController() {
        this.zoologicoDAO = new ZoologicoDAO();
    }

    public ZoologicoController(ZoologicoDAO zoologicoDAO) {
        this.zoologicoDAO = zoologicoDAO;
    }

    @Override
    public void adicionar(Zoologico zoologico) throws ZoologicoException {
        try {
            validarZoologico(zoologico);
            zoologicoDAO.criar(zoologico);
            System.out.println("Zoológico adicionado com sucesso: " + zoologico.getNome());
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao adicionar zoológico: " + e.getMessage(), e);
        }
    }

    @Override
    public Zoologico buscar(int id) throws ZoologicoException {
        try {
            return zoologicoDAO.buscarPorId(id);
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao buscar zoológico: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Zoologico> listar() throws ZoologicoException {
        try {
            return zoologicoDAO.listarTodos();
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao listar zoológicos: " + e.getMessage(), e);
        }
    }

    @Override
    public void atualizar(Zoologico zoologico) throws ZoologicoException {
        try {
            validarZoologico(zoologico);
            zoologicoDAO.atualizar(zoologico);
            System.out.println("Zoológico atualizado com sucesso: " + zoologico.getNome());
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao atualizar zoológico: " + e.getMessage(), e);
        }
    }

    @Override
    public void remover(int id) throws ZoologicoException {
        try {
            Zoologico zoologico = zoologicoDAO.buscarPorId(id);
            zoologicoDAO.deletar(id);
            System.out.println("Zoológico removido com sucesso: " + zoologico.getNome());
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao remover zoológico: " + e.getMessage(), e);
        }
    }

    public void adicionarAmbiente(int zoologicoId, Ambiente ambiente) throws ZoologicoException {
        try {
            if (ambiente == null) {
                throw new ZoologicoException("Ambiente não pode ser nulo.");
            }
            
            Zoologico zoologico = zoologicoDAO.buscarPorId(zoologicoId);
            zoologico.adicionarAmbiente(ambiente);
            zoologicoDAO.atualizar(zoologico);
            System.out.println("Ambiente adicionado ao zoológico: " + zoologico.getNome());
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao adicionar ambiente ao zoológico: " + e.getMessage(), e);
        }
    }

    public void removerAmbiente(int zoologicoId, Ambiente ambiente) throws ZoologicoException {
        try {
            if (ambiente == null) {
                throw new ZoologicoException("Ambiente não pode ser nulo.");
            }
            
            Zoologico zoologico = zoologicoDAO.buscarPorId(zoologicoId);
            zoologico.removerAmbiente(ambiente);
            zoologicoDAO.atualizar(zoologico);
            System.out.println("Ambiente removido do zoológico: " + zoologico.getNome());
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao remover ambiente do zoológico: " + e.getMessage(), e);
        }
    }

    public List<Zoologico> buscarPorNome(String nome) throws ZoologicoException {
        try {
            if (nome == null || nome.trim().isEmpty()) {
                throw new ZoologicoException("Nome para busca não pode ser vazio.");
            }
            return zoologicoDAO.buscarPorNome(nome);
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao buscar zoológicos por nome: " + e.getMessage(), e);
        }
    }

    public void exibirEstatisticas(int id) throws ZoologicoException {
        try {
            Zoologico zoologico = zoologicoDAO.buscarPorId(id);
            System.out.println("\n=== Estatísticas do Zoológico ===");
            System.out.println("Nome: " + zoologico.getNome());
            System.out.println("Localização: " + zoologico.getLocalizacao());
            System.out.println("Total de Ambientes: " + zoologico.getTotalAmbientes());
            System.out.println("Total de Animais: " + zoologico.getTotalAnimais());
            System.out.println("Horário de Funcionamento: " + zoologico.getHorarioFuncionamento());
            System.out.println("Valor do Ingresso: R$ " + String.format("%.2f", zoologico.getValorIngresso()));
            System.out.println("================================\n");
        } catch (ZoologicoException e) {
            throw e;
        } catch (Exception e) {
            throw new ZoologicoException("Erro ao exibir estatísticas: " + e.getMessage(), e);
        }
    }

    private void validarZoologico(Zoologico zoologico) throws ZoologicoException {
        if (zoologico == null) {
            throw new ZoologicoException("Zoológico não pode ser nulo.");
        }
        if (zoologico.getNome() == null || zoologico.getNome().trim().isEmpty()) {
            throw new ZoologicoException("Nome do zoológico é obrigatório.");
        }
        if (zoologico.getLocalizacao() == null || zoologico.getLocalizacao().trim().isEmpty()) {
            throw new ZoologicoException("Localização do zoológico é obrigatória.");
        }
        if (zoologico.getValorIngresso() < 0) {
            throw new ZoologicoException("Valor do ingresso não pode ser negativo.");
        }
    }
}
