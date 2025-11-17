import java.util.ArrayList;

public class Zoologico {
    private String nome;
    private String cidade;
    private int capacidade;
    private String horarioFuncionamento;
    private String diretor;
    private ArrayList<Ambiente> ambientes;

    public Zoologico(String nome, String cidade, int capacidade, String horarioFuncionamento, String diretor, int qtdAmbientes) {
        this.nome = nome;
        this.cidade = cidade;
        this.capacidade = capacidade;
        this.horarioFuncionamento = horarioFuncionamento;
        this.diretor = diretor;
        this.ambientes = new ArrayList<>(qtdAmbientes);
    }

    public void adicionarAmbiente(Ambiente ambiente) {
        ambientes.add(ambiente);
    }
    public ArrayList<Ambiente> getAmbientes() { return ambientes; }
    public String getNome() { return nome; }
    public String getCidade() { return cidade; }
    public int getCapacidade() { return capacidade; }
    public String getHorarioFuncionamento() { return horarioFuncionamento; }
    public String getDiretor() { return diretor; }
}
