package Model;

import Interface.IAnimal;

public abstract class Animal implements IAnimal {
    protected int id;
    protected String nome;
    protected int idade;
    protected String especie;
    protected double peso;
    protected String tipoAlimentacao;

    public Animal() {
    }

    public Animal(int id, String nome, int idade, String especie, double peso, String tipoAlimentacao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.peso = peso;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    @Override
    public abstract void emitirSom();

    @Override
    public void alimentar() {
        System.out.println(nome + " está se alimentando. Tipo: " + tipoAlimentacao);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                '}';
    }
}
