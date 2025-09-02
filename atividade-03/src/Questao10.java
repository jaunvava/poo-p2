import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10 para gerar a tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        } else {
            System.out.println("\nTabuada de " + numero + ":");
            System.out.println("=".repeat(15));
            
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.printf("%d X %2d = %3d%n", numero, i, resultado);
            }
        }
    }
}