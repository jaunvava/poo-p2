public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo) {
        super(saldo);
    }
    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }
}
