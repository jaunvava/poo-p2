package Model;

public class Peixe extends Animal {
    private String tipoAgua; // doce, salgada
    private double profundidadeMaxima; // em metros

    public Peixe() {
        super();
    }

    public Peixe(int id, String nome, int idade, String especie, double peso, String tipoAlimentacao,
                 String tipoAgua, double profundidadeMaxima) {
        super(id, nome, idade, especie, peso, tipoAlimentacao);
        this.tipoAgua = tipoAgua;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public double getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public void setProfundidadeMaxima(double profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " não emite som audível para humanos.");
    }

    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", tipoAgua='" + tipoAgua + '\'' +
                ", profundidadeMaxima=" + profundidadeMaxima +
                '}';
    }
}
