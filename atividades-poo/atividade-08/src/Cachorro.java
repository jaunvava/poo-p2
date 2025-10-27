public class Cachorro extends AnimalTerrestre {
    public Cachorro(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "Cachorro");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo.");
    }
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo ração.");
    }
}
