package Model;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    private int id;
    private String tipoAmbiente; // aquário, savana, floresta tropical, etc.
    private int capacidade;
    private double area; // em metros quadrados
    private double temperatura; // em graus Celsius
    private List<Animal> animais;

    public Ambiente() {
        this.animais = new ArrayList<>();
    }

    public Ambiente(int id, String tipoAmbiente, int capacidade, double area, double temperatura) {
        this.id = id;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidade = capacidade;
        this.area = area;
        this.temperatura = temperatura;
        this.animais = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public void adicionarAnimal(Animal animal) throws Exception {
        if (animais.size() >= capacidade) {
            throw new Exception("Ambiente atingiu capacidade máxima de " + capacidade + " animais.");
        }
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public int getQuantidadeAnimais() {
        return animais.size();
    }

    public boolean temEspaco() {
        return animais.size() < capacidade;
    }

    @Override
    public String toString() {
        return "Ambiente{" +
                "id=" + id +
                ", tipoAmbiente='" + tipoAmbiente + '\'' +
                ", capacidade=" + capacidade +
                ", area=" + area +
                ", temperatura=" + temperatura +
                ", quantidadeAnimais=" + animais.size() +
                '}';
    }
}
