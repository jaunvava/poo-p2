package Model;

public class Cliente extends Pessoa {

    public double saldo;

    public Cliente(String nome, String doc, double saldo){
        super(nome, doc);
        this.saldo = saldo;
    }

    public Cliente(){}

    public Cliente(String nome){
        super(nome);
    }

    public Cliente(int doc){
        super(doc);
    }

    public Cliente(double saldo){
        this.saldo = saldo;
    }

    // Método específico da classe Cliente
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo!");
        }
    }

    // Método específico da classe Cliente
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
            return true;
        } else {
            System.out.println("Saque não autorizado. Saldo insuficiente ou valor inválido!");
            return false;
        }
    }

    // Método específico da classe Cliente
    public String obterStatusConta() {
        if (this.saldo >= 5000) {
            return "Cliente Premium";
        } else if (this.saldo >= 1000) {
            return "Cliente VIP";
        } else {
            return "Cliente Padrão";
        }
    }

    // Getter e Setter para saldo
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Implementação do método abstrato da classe pai
    @Override
    public String obterTipo() {
        return "Cliente Bancário";
    }

    // Implementação do método abstrato da classe pai
    @Override
    public double calcularValorMensal() {
        // Para clientes, retorna uma taxa de manutenção baseada no status
        if (this.saldo >= 5000) {
            return 0.0; // Premium não paga taxa
        } else if (this.saldo >= 1000) {
            return 15.0; // VIP paga taxa reduzida
        } else {
            return 30.0; // Padrão paga taxa integral
        }
    }

    @Override
    public String toString(){
        return String.format("Cliente{%s, saldo=R$ %.2f, status=%s}", 
                super.toString(), this.saldo, this.obterStatusConta());
    }
}
