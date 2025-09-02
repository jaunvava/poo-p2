import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("Digite suas 5 notas:");

        for (int nota = 0; nota < notas.length; nota++) {
            System.out.print("Nota " + (nota + 1) + ": ");
            notas[nota] = scanner.nextDouble();

            while (notas[nota] < 0 || notas[nota] > 10) {
                System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
                notas[nota] = scanner.nextDouble();
            }
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nResultado:");
        System.out.println("Notas inseridas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.printf("Média final: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
            System.out.printf("Você precisava de %.2f pontos para ser aprovado.\n", (7.0 - media));
        }
    }
}