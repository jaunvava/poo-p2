import java.util.ArrayList;

public class Biblioteca {
    public String nome;
    public ArrayList<Livro> livros;
    public ArrayList<Pessoa> pessoas;
    public ArrayList<Emprestimo> emprestimos;
    public int totalLivros;
    public int totalPessoas;
    public int totalEmprestimos;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.pessoas = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro){
        for (int index=0; index < this.totalLivros; index++){
            if (this.livros.get(index).isbn.equals(livro.isbn)){
                return false;
            }
        }
        boolean statusInserido = this.livros.add(livro);
        if (statusInserido){
            this.totalLivros++;
        }
        return statusInserido;
    }

    public boolean removerLivro(String isbn){
        for (int i = 0; i < this.totalLivros; i++){
            if (this.livros.get(i).isbn.equals(isbn)){
                Livro livroBuscado = this.livros.get(i);
                this.livros.remove(livroBuscado);
                this.totalLivros--;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Livro> buscarLivroPorTitulo(String titulo){
        ArrayList<Livro> livrosBuscados = new ArrayList<>();
        for (int i = 0; i < this.totalLivros; i++){
            if (this.livros.get(i).titulo.toLowerCase().contains(titulo.toLowerCase())){
                Livro livro = this.livros.get(i);
                livrosBuscados.add(livro);
            }
        }
        return livrosBuscados;
    }

    public boolean realizarEmprestimo(String isbn, int idPessoa, String dataEmprestimo){

        Livro livro = null;

        for ( int i = 0; i < this.totalLivros; i++){
            if (this.livros.get(i).isbn.equals(isbn)){
                this.livros.get(i).disponivel = false;
                livro = this.livros.get(i);
                break;
            }
        }

        Pessoa pessoa = null;

        for (int i = 0; i < this.totalPessoas; i++){
            if (this.pessoas.get(i).id == idPessoa){
                pessoa = this.pessoas.get(i);
                break;
            }
        }

        if (livro == null || pessoa == null){
            return false;
        }

        Emprestimo emprestimo = new Emprestimo(
                livro,
                pessoa,
                dataEmprestimo
        );

        boolean statusEmprestimo = this.emprestimos.add(emprestimo);
        if (statusEmprestimo){
            this.totalEmprestimos++;
        }

        return statusEmprestimo;
    }

    public boolean realizarDevolucao(String isbn, int idPessoa, int dataEmprestimo){

    }

    public ArrayList<Livro> listarLivrosDisponiveis(){

    }

   public ArrayList<Emprestimo> listarEmprestimosAtivos(){

   }

}