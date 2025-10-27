public class Carro extends Veiculo {
    private int portas;
    public Carro(String modelo, int ano, TipoCombustivel combustivel, CategoriaVeiculo categoria, int portas) {
        super(modelo, ano, combustivel, categoria);
        this.portas = portas;
    }
    @Override
    public void exibirInfo() {
        System.out.println("Carro: " + modelo + ", Ano: " + ano + ", Portas: " + portas + ", Combustível: " + combustivel + ", Categoria: " + categoria);
    }
}
