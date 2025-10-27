public class Papagaio extends AnimalAereo {
    public Papagaio(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "Papagaio");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " está falando.");
    }
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo sementes.");
    }
}
