public abstract class Ambiente {
    protected String nome;
    protected String tipo;
    public Ambiente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
}
