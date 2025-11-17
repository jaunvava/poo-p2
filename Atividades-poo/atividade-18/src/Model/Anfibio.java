package Model;

public class Anfibio extends Animal {
    private boolean metamorfose;
    private String habitatPreferido; // aquático, terrestre, ambos

    public Anfibio() {
        super();
    }

    public Anfibio(int id, String nome, int idade, String especie, double peso, String tipoAlimentacao,
                   boolean metamorfose, String habitatPreferido) {
        super(id, nome, idade, especie, peso, tipoAlimentacao);
        this.metamorfose = metamorfose;
        this.habitatPreferido = habitatPreferido;
    }

    public boolean isMetamorfose() {
        return metamorfose;
    }

    public void setMetamorfose(boolean metamorfose) {
        this.metamorfose = metamorfose;
    }

    public String getHabitatPreferido() {
        return habitatPreferido;
    }

    public void setHabitatPreferido(String habitatPreferido) {
        this.habitatPreferido = habitatPreferido;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está coaxando.");
    }

    public void saltar() {
        System.out.println(nome + " está saltando.");
    }

    @Override
    public String toString() {
        return "Anfibio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", metamorfose=" + metamorfose +
                ", habitatPreferido='" + habitatPreferido + '\'' +
                '}';
    }
}
