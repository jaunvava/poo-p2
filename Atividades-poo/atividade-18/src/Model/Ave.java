package Model;

public class Ave extends Animal {
    private double envergaduraAsas; // em metros
    private boolean podeVoar;

    public Ave() {
        super();
    }

    public Ave(int id, String nome, int idade, String especie, double peso, String tipoAlimentacao,
               double envergaduraAsas, boolean podeVoar) {
        super(id, nome, idade, especie, peso, tipoAlimentacao);
        this.envergaduraAsas = envergaduraAsas;
        this.podeVoar = podeVoar;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está cantando ou piando.");
    }

    public void voar() {
        if (podeVoar) {
            System.out.println(nome + " está voando.");
        } else {
            System.out.println(nome + " não pode voar.");
        }
    }

    @Override
    public String toString() {
        return "Ave{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", envergaduraAsas=" + envergaduraAsas +
                ", podeVoar=" + podeVoar +
                '}';
    }
}
