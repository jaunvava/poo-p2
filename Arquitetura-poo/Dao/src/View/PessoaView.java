package View;

import Controller.PessoaController;
import Models.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaView {

    static PessoaController controller = new PessoaController();

    public static void criarPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome da pessoa: ");
        String nome = input.nextLine();

        Pessoa pessoa = new Pessoa(nome);

        boolean status = controller.inserirPessoa(pessoa);

        if (status) {
            System.out.println("Conseguiu Criar");
        } else {
            System.out.println("Pessoa não criada!");
        }

    }

    public static ArrayList<Pessoa> listarTodos() {
        ArrayList<Pessoa> lista = controller.retornarTodos();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada!");
        } else {
            System.out.println("---- Lista de Pessoas ----");
            for (Pessoa p : lista) {
                System.out.println("Nome: " + p.getNome());
            }
        }

        return lista;
    }
}