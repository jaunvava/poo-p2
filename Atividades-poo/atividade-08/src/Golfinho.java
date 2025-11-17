public class Golfinho extends AnimalAquatico {
    public Golfinho(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "Golfinho");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " está assobiando.");
    }
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo peixes.");
    }
}
