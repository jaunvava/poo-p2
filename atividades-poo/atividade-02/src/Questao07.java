import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = scanner.nextDouble();

        System.out.println("\nCódigos de pagamento:");
        System.out.println("1 - À vista (10% de desconto)");
        System.out.println("2 - A prazo (5% de acréscimo)");
        System.out.print("Digite o código de pagamento: ");
        int codigoPagamento = scanner.nextInt();

        if (codigoPagamento == 1) {
            double desconto = precoOriginal * 0.10;
            double precoFinal = precoOriginal - desconto;
            System.out.printf("\nPreço original: R$ %.2f%n", precoOriginal);
            System.out.printf("Desconto (10%%): R$ %.2f%n", desconto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
            
        } else if (codigoPagamento == 2) {
            double acrescimo = precoOriginal * 0.05;
            double precoFinal = precoOriginal + acrescimo;
            System.out.printf("\nPreço original: R$ %.2f%n", precoOriginal);
            System.out.printf("Acréscimo (5%%): R$ %.2f%n", acrescimo);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
            
        } else {
            System.out.println("\nCódigo inválido, digite 1 ou 2.");
        }
    }
}