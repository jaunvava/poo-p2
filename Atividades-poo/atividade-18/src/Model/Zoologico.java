package Model;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private int id;
    private String nome;
    private String localizacao;
    private String horarioFuncionamento;
    private double valorIngresso;
    private List<Ambiente> ambientes;

    public Zoologico() {
        this.ambientes = new ArrayList<>();
    }

    public Zoologico(int id, String nome, String localizacao, String horarioFuncionamento, double valorIngresso) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.horarioFuncionamento = horarioFuncionamento;
        this.valorIngresso = valorIngresso;
        this.ambientes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public List<Ambiente> getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(List<Ambiente> ambientes) {
        this.ambientes = ambientes;
    }

    public void adicionarAmbiente(Ambiente ambiente) {
        ambientes.add(ambiente);
    }

    public void removerAmbiente(Ambiente ambiente) {
        ambientes.remove(ambiente);
    }

    public int getTotalAmbientes() {
        return ambientes.size();
    }

    public int getTotalAnimais() {
        int total = 0;
        for (Ambiente ambiente : ambientes) {
            total += ambiente.getQuantidadeAnimais();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", horarioFuncionamento='" + horarioFuncionamento + '\'' +
                ", valorIngresso=" + valorIngresso +
                ", totalAmbientes=" + ambientes.size() +
                ", totalAnimais=" + getTotalAnimais() +
                '}';
    }
}
