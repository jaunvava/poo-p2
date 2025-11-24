package Modules.VirtualPet;

import Enums.EspecieEnum;

public class VirtualPetModel {
    private String nome;
    private EspecieEnum especie;
    private boolean fome;
    private boolean sujo;

    public VirtualPetModel() {
        this.fome = true;
        this.sujo = true;
    }

    public VirtualPetModel(String nome, EspecieEnum especie) {
        this.nome = nome;
        this.especie = especie;
        this.fome = true;
        this.sujo = true;
    }

    public String getNome() {
        return nome;
    }

    public EspecieEnum getEspecie() {
        return especie;
    }

    public boolean isFome() {
        return fome;
    }

    public boolean isSujo() {
        return sujo;
    }

    protected void alimentar() {
        this.fome = false;
    }

    protected void limpar() {
        this.sujo = false;
    }

    protected void brincar() {
        limpar();
        alimentar();
    }

    @Override
    public String toString() {
        return "VirtualPetModel{" +
                "nome='" + nome + '\'' +
                ", especie=" + especie +
                ", fome=" + fome +
                ", sujo=" + sujo +
                '}';
    }
}
