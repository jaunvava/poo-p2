public class Pessoa {
    public String nome;
    public int id;
    public String telefone;
    public String email;

    public Pessoa(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public void atualizarEmail(String email){
        this.email = email;
    }

    public void atualizarTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format("<Pessoa: nome=%s>", this.nome);
    }
}
