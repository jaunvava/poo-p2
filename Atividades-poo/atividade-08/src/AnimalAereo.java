public abstract class AnimalAereo extends Animal {
    public AnimalAereo(String nome, int idade, double peso, String cor, String especie) {
        super(nome, idade, peso, cor, especie);
    }
    @Override
    public void mover() {
        System.out.println(nome + " está voando.");
    }
}
