package Model;

import contracts.InterfaceAutenticacao;

import java.time.LocalDate;

abstract class Pessoa implements InterfaceAutenticacao {
    private String nome;
    private String matricula;
    private String doc;
    private LocalDate dataNascimento;
    private String senha;

    public Pessoa(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return "";
    }

    public String setDataNascimento(String dataNascimento) {
      return this.dataNascimento.toString();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean login(String senha) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}