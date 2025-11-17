package Models;

import DAO.InterfaceId;

import java.util.UUID;

public class Pessoa implements InterfaceId {
    private UUID id;
    private String nome;

    public Pessoa(String nome){
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }


}