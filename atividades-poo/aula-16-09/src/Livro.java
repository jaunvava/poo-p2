public class Livro {
    public String titulo;
    public String autor;
    public String isbn;
    public int anoPublicado;
    public boolean disponivel;

    public Livro(String titulo, String autor, String isbn){
        this.disponivel = true;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void atualizarAnoPublicado(int ano){
        this.anoPublicado = ano;
    }

    @Override
    public String toString() {
        //return String.format("%s (%d)", this.titulo, this.anoPublicado)
        return String.format(
                "<Livro: titulo=%s, ano=%d>",
                this.titulo, this.anoPublicado
        );
    }
}
