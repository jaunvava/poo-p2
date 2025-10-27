public class Emprestimo {
    public Livro livro;
    public Pessoa pessoa;
    public String dataEmprestimo;
    public String dataDevolucaoPrevista;
    public String dataDevolucaoReal;
    public String status; // EMPRESTADO, DEVOLVIDO

    public Emprestimo(Livro livro, Pessoa pessoa, String dataEmprestimo){
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.status = "EMPRESTADO";
    }

    public void atualizarDataDevolucaoPrevista(String data){
        this.dataDevolucaoPrevista = data;
    }

    public void atualizarDataDevolucaoReal(String data){
        this.dataDevolucaoReal = data;
    }

    public void atualizarStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
          "<\nEmprestimo:\nlivro=%s,\npessoa=%s,\ndevolução prevista=%s,\nstatus=%s\n>",
          this.livro, this.pessoa, this.dataDevolucaoPrevista, this.status
        );
    }
}

