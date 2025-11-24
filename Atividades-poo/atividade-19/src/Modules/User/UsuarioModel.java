package Modules.User;

import Modules.VirtualPet.VirtualPetModel;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class UsuarioModel {
    private int id;
    private String nome;
    private boolean logado;
    private String email;
    private VirtualPetModel petVirtual;
    private String senha;

    public UsuarioModel(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.logado = false;
        // Codificar senha em Base64
        this.senha = Base64.getEncoder().encodeToString(senha.getBytes(StandardCharsets.UTF_8));
        this.petVirtual = null;
    }

    protected boolean entrar() {
        this.logado = true;
        return true;
    }

    protected String getEmail() {
        return email;
    }

    protected String getSenha() {
        return senha;
    }

    public void adotarPet(VirtualPetModel petVirtual) {
        this.petVirtual = petVirtual;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", logado=" + logado +
                ", email='" + email + '\'' +
                ", petVirtual=" + petVirtual +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLogado() {
        return logado;
    }

    public VirtualPetModel getPetVirtual() {
        return petVirtual;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
