public abstract class Animal {
    protected String nome;
    protected int idade;
    protected double peso;
    protected String cor;
    protected String especie;

    public Animal(String nome, int idade, double peso, String cor, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.especie = especie;
    }

    public abstract void mover();
    public abstract void emitirSom();
    public abstract void alimentar();

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }
    public String getCor() { return cor; }
    public String getEspecie() { return especie; }
}
