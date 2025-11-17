public abstract class Veiculo implements Registravel, Vendavel, Manutencao {
    protected String modelo;
    protected int ano;
    protected TipoCombustivel combustivel;
    protected CategoriaVeiculo categoria;
    protected boolean vendido;

    public Veiculo(String modelo, int ano, TipoCombustivel combustivel, CategoriaVeiculo categoria) {
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.categoria = categoria;
        this.vendido = false;
    }
    public abstract void exibirInfo();
    public void registrar() {
        System.out.println("Veículo registrado: " + modelo);
    }
    public void vender() {
        vendido = true;
        System.out.println("Veículo vendido: " + modelo);
    }
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no veículo: " + modelo);
    }
}
