package br.com.cz.delivery.model.usuario;

import br.com.cz.delivery.contracts.IPagador;
import br.com.cz.delivery.exceptions.SaldoInsuficienteException;

public class Cliente extends Usuario implements IPagador {

    private Endereco endereco;

    public Cliente(Endereco endereco){
        this.endereco = endereco;
    }

    @Override
    public boolean pagar(int valor){
        if (this.moedas - valor < 0){
            throw new SaldoInsuficienteException();
        }
        this.moedas -= valor;
        return true;
    }

    @Override
    public double getSaldo() {
        return (double) moedas / 100;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente"+super.toString();
    }
}
