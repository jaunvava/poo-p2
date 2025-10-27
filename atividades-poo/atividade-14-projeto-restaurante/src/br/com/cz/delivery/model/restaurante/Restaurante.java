package br.com.cz.delivery.model.restaurante;

import br.com.cz.delivery.model.usuario.Atendente;
import br.com.cz.delivery.model.usuario.Entregador;

import java.util.ArrayList;
import java.util.UUID;

public class Restaurante {
    private UUID id;
    private String nome;
    private ArrayList<Entregador> entregadores;
    private Atendente atendente;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Entrega> entregas;
    private Cardapio cardapio;

    public Restaurante(String nome){
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cardapio = new Cardapio();
        this.pedidos = new ArrayList<>();
        this.entregas = new ArrayList<>();
        this.entregadores = new ArrayList<>();
    }

    public boolean contratarAtendente(Atendente atendente){
        // IMPLEMENTE CORRETAMENTE ESTE MÉTODO, NÃO É POSSÍVEL EXISTIR MAIS DE UM ATENDENTE,
        // PARA CONTRATAR UM NOVO, DEVE DEMITIR O ANTERIOR
        return false;
    }

    public boolean inserirNoCardapio(){
        // Estude o projeto e implemente corretamente esta funcionalidade
        return false;
    }

    public boolean contratarEntregador(Entregador entregador){
        // Estude o projeto e implemente corretamente esta funcionalidade
        return false;
    }

    public boolean fazerUmPedido(){
        // IMPLEMENTAR LÓGICA PARA REALIZAR UM PEDIDO
        return false;
    }

    /**
     * Implemente métodos para:
     * - buscar pedido por id
     * - buscar cliente por nome, id
     * - buscar entregas pelo nome do cliente, pelo nome do entregador e pelo codigo do pedido
     * - cadastrar novo item no cardapio
     * - enviar o entregador para entrega
     * - e demais métodos que você achar fazer sentido existir no projeto, crie outros 8 métodos
    * */


    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Entrega> getEntregas() {
        return entregas;
    }

    public ArrayList<Entregador> getEntregadores() {
        return entregadores;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", entregadores=" + entregadores +
                ", atendente=" + atendente +
                ", pedidos=" + pedidos +
                ", entregas=" + entregas +
                ", cardapio=" + cardapio +
                '}';
    }
}
