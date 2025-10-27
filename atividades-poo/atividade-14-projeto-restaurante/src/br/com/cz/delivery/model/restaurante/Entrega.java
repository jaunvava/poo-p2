package br.com.cz.delivery.model.restaurante;

import br.com.cz.delivery.enums.StatusEntrega;
import br.com.cz.delivery.model.usuario.Cliente;
import br.com.cz.delivery.model.usuario.Endereco;
import br.com.cz.delivery.model.usuario.Entregador;

import java.util.UUID;

class Entrega {
    private UUID id;
    private Cliente cliente;
    private Entregador entregador;
    private Pedido pedido;
    private Endereco enderecoEntrega;
    private StatusEntrega statusEntrega;

    public Entrega(Cliente cliente, Entregador entregador, Pedido pedido) {
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.entregador = entregador;
        this.pedido = pedido;
        this.enderecoEntrega = cliente.getEndereco();
        this.statusEntrega = StatusEntrega.SAIU_PARA_ENTREGA;
    }

    public UUID getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void mudarStatusEntrega(StatusEntrega status){
        this.statusEntrega = status;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", entregador=" + entregador +
                ", pedido=" + pedido +
                ", enderecoEntrega=" + enderecoEntrega +
                ", statusEntrega=" + statusEntrega +
                '}';
    }
}
