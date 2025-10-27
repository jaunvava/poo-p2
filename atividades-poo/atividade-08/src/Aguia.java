public class Aguia extends AnimalAereo {
    public Aguia(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "Águia");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " está piando.");
    }
    @Override
    public void alimentar() {
        System.out.println(nome + " está caçando.");
    }
}
