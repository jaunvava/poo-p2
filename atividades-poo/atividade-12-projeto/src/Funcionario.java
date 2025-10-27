public class Funcionario extends Pessoa {
    private CargoFuncionario cargo;
    public Funcionario(String nome, String cpf, CargoFuncionario cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }
    @Override
    public void exibirDados() {
        System.out.println("Funcionário: " + nome + ", CPF: " + cpf + ", Cargo: " + cargo);
    }
}
