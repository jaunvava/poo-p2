package br.com.cz.delivery.model.usuario;

import br.com.cz.delivery.contracts.IRecebedor;
import br.com.cz.delivery.exceptions.RecebimentoSalarioException;

public class Atendente extends Usuario implements IRecebedor {

    private static final int VALOR_BONIFICACAO = 20_000;

    public Atendente(){}

    @Override
    public boolean receberSalario(int valor) {
        if (valor <= 0){
            throw new RecebimentoSalarioException();
        }
        this.moedas += valor;
        this.moedas += VALOR_BONIFICACAO;
        return true;
    }

    @Override
    public double getSaldo() {
        return (double) this.moedas /100;
    }

    @Override
    public String toString() {
        return "Atendente"+super.toString();
    }
}
