package br.com.cz.delivery.main;
import br.com.cz.delivery.model.restaurante.ItemCardapio;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        var restaurante = new br.com.cz.delivery.model.restaurante.Restaurante("Restaurante Central");

        var atendente = new br.com.cz.delivery.model.usuario.Atendente();
        atendente.setNome("Maria");
        atendente.setDoc("12345678901");
        atendente.setEmail("maria@email.com");
        atendente.setSenha("senhaSegura1");
        restaurante.contratarAtendente(atendente);

        var entregador = new br.com.cz.delivery.model.usuario.Entregador();
        entregador.setNome("João");
        entregador.setDoc("10987654321");
        entregador.setEmail("joao@email.com");
        entregador.setSenha("senhaSegura2");
        restaurante.contratarEntregador(entregador);

        var endereco = new br.com.cz.delivery.model.usuario.Endereco(
                "100", "Rua das Flores", "Centro", "CidadeX", "12345-678", "Apto 101", "Próx. à praça");
        var cliente = new br.com.cz.delivery.model.usuario.Cliente(endereco);
        cliente.setNome("Carlos");
        cliente.setDoc("11122233344");
        cliente.setEmail("carlos@email.com");
        cliente.setSenha("senhaSegura3");

        var item1 = new br.com.cz.delivery.model.restaurante.ItemCardapio("Pizza", 3500, "Pizza de muçarela");
        var item2 = new br.com.cz.delivery.model.restaurante.ItemCardapio("Refrigerante", 800, "Coca-Cola lata");
        restaurante.getCardapio().inserir(item1);
        restaurante.getCardapio().inserir(item2);

        java.util.ArrayList<br.com.cz.delivery.model.restaurante.ItemCardapio> itensPedido = new java.util.ArrayList<>();
        itensPedido.add(item1);
        itensPedido.add(item2);

        System.out.println("Restaurante criado: " + restaurante.getNome());
        System.out.println("Atendente: " + atendente);
        System.out.println("Entregador: " + entregador);
        System.out.println("Cliente: " + cliente);
        System.out.println("Cardápio:");
        for (Object obj : restaurante.getCardapio().retornarTodos()) {
            System.out.println(obj);
        }
    }
}
