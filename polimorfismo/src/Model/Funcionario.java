package Model;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario() {
        super();
        this.cargo = "Estagiario";
        this.salario = 1000.0;
        this.departamento = "Geral";
    }

    public Funcionario(String nome, String doc, String cargo, double salario, String departamento) {
        super();
        this.setName(nome);
        this.setDoc(doc);
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Polimorfismo: sobrescrevendo o metodo da classe pai
    @Override
    public String obterTipo() {
        return "Funcionario - " + cargo;
    }

    // Polimorfismo: sobrescrevendo o metodo da classe pai
    @Override
    public void apresentar() {
        System.out.println("Ola! Sou " + cargo + " do departamento " + departamento + 
                          ", me chamo " + this.toString().split("'")[1] + 
                          " e meu salario e R$ " + salario);
    }

    // Metodos especificos da classe Funcionario
    public void trabalhar() {
        System.out.println(cargo + " " + this.toString().split("'")[1] + " esta trabalhando no departamento " + departamento);
    }

    public void receberPromocao(String novoCargo, double novoSalario) {
        System.out.println("Parabens! " + this.toString().split("'")[1] + " foi promovido(a) de " + 
                          cargo + " para " + novoCargo);
        this.cargo = novoCargo;
        this.salario = novoSalario;
        System.out.println("Novo salario: R$ " + salario);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    // Getters e Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}