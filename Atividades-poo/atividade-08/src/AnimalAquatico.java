public abstract class AnimalAquatico extends Animal {
    public AnimalAquatico(String nome, int idade, double peso, String cor, String especie) {
        super(nome, idade, peso, cor, especie);
    }
    @Override
    public void mover() {
        System.out.println(nome + " está nadando.");
    }
}
