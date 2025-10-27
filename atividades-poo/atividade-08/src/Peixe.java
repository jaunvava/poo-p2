public class Peixe extends AnimalAquatico {
    public Peixe(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "Peixe");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz bolhas.");
    }
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo algas.");
    }
}
