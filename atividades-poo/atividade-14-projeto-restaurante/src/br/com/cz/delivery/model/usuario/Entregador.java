package br.com.cz.delivery.model.usuario;

import br.com.cz.delivery.contracts.IRecebedor;
import br.com.cz.delivery.enums.StatusEntregador;
import br.com.cz.delivery.exceptions.QuantidadeEntregasException;

public class Entregador extends Usuario implements IRecebedor {

    private static final int VALOR_POR_ENTREGA = 1000;
    private StatusEntregador statusEntregador;

    public Entregador(){
        this.statusEntregador = StatusEntregador.INDISPONIVEL;
    }

    /***
     * @param quantidadeEntregas quantidade de entregas feitas para calcular quanto o entregador irá receber
     * @return true: | false, dependendo da quantidade de entregas feitas, 0 ou numeros negativos retornal false
     */
    @Override
    public boolean receberSalario(int quantidadeEntregas) {
        if (quantidadeEntregas <= 0){
            throw new QuantidadeEntregasException();
        }
        this.moedas += quantidadeEntregas * VALOR_POR_ENTREGA;
        return true;
    }

    public StatusEntregador getStatusEntregador() {
        return statusEntregador;
    }

    @Override
    public double getSaldo() {
        return (double) this.moedas /100;
    }

    @Override
    public String toString() {
        return "Entregador"+super.toString();
    }
}
