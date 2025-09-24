package Model;

public class Cliente extends Pessoa {
    private double saldo;
    private String tipoCliente;

    public Cliente() {
        super();
        this.saldo = 0.0;
        this.tipoCliente = "Padrao";
    }

    public Cliente(String nome, String doc, double saldo) {
        super();
        this.setName(nome);
        this.setDoc(doc);
        this.saldo = saldo;
        this.tipoCliente = definirTipoCliente();
    }

    private String definirTipoCliente() {
        if (saldo >= 10000) {
            return "Premium";
        } else if (saldo >= 5000) {
            return "Gold";
        } else if (saldo >= 1000) {
            return "Silver";
        } else {
            return "Padrao";
        }
    }

    // Polimorfismo: sobrescrevendo o metodo da classe pai
    @Override
    public String obterTipo() {
        return "Cliente " + tipoCliente;
    }

    // Polimorfismo: sobrescrevendo o metodo da classe pai
    @Override
    public void apresentar() {
        System.out.println("Ola! Sou um " + obterTipo() + " do banco, me chamo " + 
                          this.toString().split("'")[1] + " e tenho saldo de R$ " + saldo);
    }

    // Metodo especifico da classe Cliente
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            tipoCliente = definirTipoCliente();
            System.out.println("Deposito realizado! Novo saldo: R$ " + saldo);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            tipoCliente = definirTipoCliente();
            System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor invalido!");
            return false;
        }
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.tipoCliente = definirTipoCliente();
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}