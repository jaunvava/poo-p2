import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(10, 5, 5);
        int opcao;
        do {
            System.out.println("\n--- MENU BIBLIOTECA ---");
            System.out.println("1. Inserir livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Reservar livro");
            System.out.println("6. Verificar disponibilidade");
            System.out.println("7. Listar acervo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    Livro livro = new Livro(codigo, titulo, EnumDisponibilidadeLivro.DISPONIVEL);
                    if (biblioteca.inserir(livro))
                        System.out.println("Livro inserido!");
                    else
                        System.out.println("Acervo cheio!");
                    break;
                case 2:
                    System.out.print("Código do livro para remover: ");
                    String codRemover = sc.nextLine();
                    if (biblioteca.removerLivroPorCodigo(codRemover))
                        System.out.println("Livro removido!");
                    else
                        System.out.println("Livro não encontrado!");
                    break;
                case 3:
                    System.out.print("Código do livro para emprestar: ");
                    String codEmprestar = sc.nextLine();
                    if (biblioteca.emprestar(codEmprestar))
                        System.out.println("Livro emprestado!");
                    else
                        System.out.println("Não foi possível emprestar!");
                    break;
                case 4:
                    System.out.print("Código do livro para devolver: ");
                    String codDevolver = sc.nextLine();
                    if (biblioteca.devolver(codDevolver))
                        System.out.println("Livro devolvido!");
                    else
                        System.out.println("Livro não encontrado nos empréstimos!");
                    break;
                case 5:
                    System.out.print("Código do livro para reservar: ");
                    String codReservar = sc.nextLine();
                    if (biblioteca.reservar(codReservar))
                        System.out.println("Livro reservado!");
                    else
                        System.out.println("Não foi possível reservar!");
                    break;
                case 6:
                    System.out.print("Código do livro: ");
                    String codDisp = sc.nextLine();
                    EnumDisponibilidadeLivro disp = biblioteca.verificarDisponibilidade(codDisp);
                    if (disp != null)
                        System.out.println("Disponibilidade: " + disp);
                    else
                        System.out.println("Livro não encontrado!");
                    break;
                case 7:
                    System.out.println(biblioteca);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        sc.close();
    }
}
