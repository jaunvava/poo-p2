public abstract class Conta {
    protected double saldo;
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor) {
        if (valor <= saldo) saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public double obterSaldo() {
        return saldo;
    }
}
