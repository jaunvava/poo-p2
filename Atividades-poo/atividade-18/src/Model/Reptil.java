package Model;

public class Reptil extends Animal {
    private boolean venenoso;
    private String tipoEscama;

    public Reptil() {
        super();
    }

    public Reptil(int id, String nome, int idade, String especie, double peso, String tipoAlimentacao,
                  boolean venenoso, String tipoEscama) {
        super(id, nome, idade, especie, peso, tipoAlimentacao);
        this.venenoso = venenoso;
        this.tipoEscama = tipoEscama;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo sibilo ou outro som de réptil.");
    }

    public void rastejar() {
        System.out.println(nome + " está rastejando.");
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", venenoso=" + venenoso +
                ", tipoEscama='" + tipoEscama + '\'' +
                '}';
    }
}
