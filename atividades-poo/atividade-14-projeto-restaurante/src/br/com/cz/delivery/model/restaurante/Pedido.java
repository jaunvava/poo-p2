package br.com.cz.delivery.model.restaurante;

import br.com.cz.delivery.enums.StatusPagamento;
import br.com.cz.delivery.enums.StatusPedido;
import br.com.cz.delivery.enums.TipoPagamento;
import br.com.cz.delivery.model.usuario.Cliente;

import java.util.ArrayList;
import java.util.UUID;

class Pedido {
    private UUID id;
    private String codigo;
    private Cliente comprador;
    private ArrayList<ItemCardapio> items;
    private StatusPedido statusPedido;
    private StatusPagamento statusPagamento;
    private TipoPagamento tipoPagamento;

    Pedido(Cliente comprador, ArrayList<ItemCardapio> items){
        this.id = UUID.randomUUID();
        /*this.codigo = */ // implemente uma regra para gerar o código de até 8 caracteres
        this.comprador = comprador;
        this.items = items;
        this.statusPagamento = StatusPagamento.PEDENTE;
        this.tipoPagamento = TipoPagamento.NAO_PAGO;
        this.statusPedido = StatusPedido.PENDENTE;
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public ArrayList<ItemCardapio> getItems() {
        return items;
    }

    boolean acrescentarItem(ItemCardapio item){
        if (this.statusPagamento == StatusPagamento.PEDENTE){
            this.items.add(item);
            return true;
        }
        return false;
    }

    boolean removerItem(int id){
        if (this.statusPagamento != StatusPagamento.PEDENTE){
            return false;
        }
        for (int i = 0; i < this.items.size(); i++){
            if (this.items.get(i).getId() == i){
                this.items.set(i, null);
                return true;
            }
        }
        return false;
    }

    boolean pagar(int valor, TipoPagamento tipoPagamento){
        if (this.statusPagamento == StatusPagamento.PAGO){
            return false;
        }
        if (this.statusPagamento == StatusPagamento.CANCELADO){
            return false;
        }
        if (valor == valorTotal()){
            this.statusPagamento = StatusPagamento.PAGO;
            this.tipoPagamento = tipoPagamento;
            this.statusPedido = StatusPedido.EM_PREPARACAO;
            return true;
        }
        return false;
    }

    public void prepararPedido(){
        this.statusPedido = StatusPedido.PREPARADO;
    }

    boolean cancelarPedido(){
        if (this.statusPagamento == StatusPagamento.PEDENTE){
            this.statusPagamento = StatusPagamento.CANCELADO;
            return true;
        }
        return false;
    }

    int valorTotal(){
        int valor = 0;
        for (int i=0; i < this.items.size(); i++){
            valor += this.items.get(i).getPreco();
        }
        return valor;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    StatusPagamento getStatusPagamento(){
        return this.statusPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", comprador=" + comprador +
                ", items=" + items +
                ", valor=" + valorTotal() +
                ", statusPedido=" + statusPedido +
                ", statusPagamento=" + statusPagamento +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
