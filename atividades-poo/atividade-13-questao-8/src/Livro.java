public class Livro {
    private String codigo;
    private String titulo;
    private EnumDisponibilidadeLivro disponibilidade;

    public Livro(String codigo, String titulo, EnumDisponibilidadeLivro disponibilidade) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponibilidade = disponibilidade;
    }
    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public EnumDisponibilidadeLivro getDisponibilidade() { return disponibilidade; }
    public void setDisponibilidade(EnumDisponibilidadeLivro disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    @Override
    public String toString() {
        return "[" + codigo + "] " + titulo + " - " + disponibilidade;
    }
}
