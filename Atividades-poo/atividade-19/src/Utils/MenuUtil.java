package Utils;

import java.util.Scanner;

public class MenuUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void limparTela() {
        // Simula limpar tela (funciona melhor em terminal)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = Integer.parseInt(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static void exibirErro(String mensagem) {
        System.out.println("❌ ERRO: " + mensagem);
    }

    public static void exibirSucesso(String mensagem) {
        System.out.println("✅ SUCESSO: " + mensagem);
    }

    public static void exibirCabecalho(String titulo) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("  " + titulo);
        System.out.println("=".repeat(50));
    }
}
