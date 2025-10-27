import java.util.ArrayList;

public class Biblioteca implements IBiblioteca {
    private Livro[] acervo;
    private int quantidadeLivrosInseridos;
    private Livro[] emprestimos;
    private int quantidadeEmprestimosRealizados;
    private Livro[] reservas;
    private int quantidadeReservasRealizadas;

    public Biblioteca(int limiteLivros, int limiteEmprestimos, int limiteReservas) {
        this.acervo = new Livro[limiteLivros];
        this.emprestimos = new Livro[limiteEmprestimos];
        this.reservas = new Livro[limiteReservas];
        this.quantidadeLivrosInseridos = 0;
        this.quantidadeEmprestimosRealizados = 0;
        this.quantidadeReservasRealizadas = 0;
    }

    @Override
    public Livro buscarLivroPorCodigo(String codigoLivro) {
        for (int i = 0; i < quantidadeLivrosInseridos; i++) {
            if (acervo[i].getCodigo().equals(codigoLivro)) {
                return acervo[i];
            }
        }
        return null;
    }

    @Override
    public boolean inserir(Livro livro) {
        if (quantidadeLivrosInseridos < acervo.length) {
            acervo[quantidadeLivrosInseridos++] = livro;
            return true;
        }
        return false;
    }

    @Override
    public boolean removerLivroPorCodigo(String codigoLivro) {
        for (int i = 0; i < quantidadeLivrosInseridos; i++) {
            if (acervo[i].getCodigo().equals(codigoLivro)) {
                for (int j = i; j < quantidadeLivrosInseridos - 1; j++) {
                    acervo[j] = acervo[j + 1];
                }
                acervo[--quantidadeLivrosInseridos] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean emprestar(String codigoLivro) {
        Livro livro = buscarLivroPorCodigo(codigoLivro);
        if (livro != null && livro.getDisponibilidade() == EnumDisponibilidadeLivro.DISPONIVEL && quantidadeEmprestimosRealizados < emprestimos.length) {
            livro.setDisponibilidade(EnumDisponibilidadeLivro.EMPRESTADO);
            emprestimos[quantidadeEmprestimosRealizados++] = livro;
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver(String codigoLivro) {
        for (int i = 0; i < quantidadeEmprestimosRealizados; i++) {
            if (emprestimos[i].getCodigo().equals(codigoLivro)) {
                emprestimos[i].setDisponibilidade(EnumDisponibilidadeLivro.DISPONIVEL);
                for (int j = i; j < quantidadeEmprestimosRealizados - 1; j++) {
                    emprestimos[j] = emprestimos[j + 1];
                }
                emprestimos[--quantidadeEmprestimosRealizados] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean reservar(String codigoLivro) {
        Livro livro = buscarLivroPorCodigo(codigoLivro);
        if (livro != null && livro.getDisponibilidade() == EnumDisponibilidadeLivro.DISPONIVEL && quantidadeReservasRealizadas < reservas.length) {
            livro.setDisponibilidade(EnumDisponibilidadeLivro.RESERVADO);
            reservas[quantidadeReservasRealizadas++] = livro;
            return true;
        }
        return false;
    }

    @Override
    public EnumDisponibilidadeLivro verificarDisponibilidade(String codigoLivro) {
        Livro livro = buscarLivroPorCodigo(codigoLivro);
        if (livro != null) {
            return livro.getDisponibilidade();
        }
        return null;
    }

    public int getQuantidadeLivrosInseridos() {
        return quantidadeLivrosInseridos;
    }
    public int getQuantidadeEmprestimosRealizados() {
        return quantidadeEmprestimosRealizados;
    }
    public int getQuantidadeReservasRealizadas() {
        return quantidadeReservasRealizadas;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Acervo:\n");
        for (int i = 0; i < quantidadeLivrosInseridos; i++) {
            sb.append(acervo[i]).append("\n");
        }
        return sb.toString();
    }
}
