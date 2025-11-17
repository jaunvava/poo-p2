package Model;

public class Mamifero extends Animal {
    private String tipoPelagem;
    private int periodoGestacao; // em dias

    public Mamifero() {
        super();
    }

    public Mamifero(int id, String nome, int idade, String especie, double peso, String tipoAlimentacao,
                    String tipoPelagem, int periodoGestacao) {
        super(id, nome, idade, especie, peso, tipoAlimentacao);
        this.tipoPelagem = tipoPelagem;
        this.periodoGestacao = periodoGestacao;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public int getPeriodoGestacao() {
        return periodoGestacao;
    }

    public void setPeriodoGestacao(int periodoGestacao) {
        this.periodoGestacao = periodoGestacao;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo som característico de mamífero.");
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", tipoPelagem='" + tipoPelagem + '\'' +
                ", periodoGestacao=" + periodoGestacao +
                '}';
    }
}
