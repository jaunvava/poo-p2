public class Elefante extends AnimalTerrestre {
    public Elefante(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "Elefante");
    }
    @Override
    public void emitirSom() {
        System.out.println(nome + " está trombeteando.");
    }
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo folhas.");
    }
}
