package Main;

import View.App;
import View.PessoaView;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            PessoaView.criarPessoa();
        }



        App.menu();
        String op = App.getOp();

        switch (op){
            case "0" -> System.exit(0);
            case "1" -> PessoaView.criarPessoa();
            case "2" -> System.out.println(PessoaView.listarTodos());
            default -> System.out.println("Opção Inválida");
        }
    }
}