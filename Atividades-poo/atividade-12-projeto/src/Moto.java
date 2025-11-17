public class Moto extends Veiculo {
    private int cilindradas;
    public Moto(String modelo, int ano, TipoCombustivel combustivel, int cilindradas) {
        super(modelo, ano, combustivel, CategoriaVeiculo.MOTO);
        this.cilindradas = cilindradas;
    }
    @Override
    public void exibirInfo() {
        System.out.println("Moto: " + modelo + ", Ano: " + ano + ", Cilindradas: " + cilindradas + ", Combustível: " + combustivel);
    }
}
