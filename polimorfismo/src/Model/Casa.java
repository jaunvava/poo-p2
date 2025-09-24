package Model;

public class Casa {
    private Pessoa pessoa;

    public void inserirPessoa(String nome, String doc){
        this.pessoa = new Pessoa();
        this.pessoa.setName(nome);
        this.pessoa.setDoc(doc);
    }

    // Metodo para inserir uma pessoa ja criada (polimorfismo)
    public void inserirPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "pessoa=" + pessoa +
                '}';
    }
}
