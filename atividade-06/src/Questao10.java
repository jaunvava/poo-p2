import java.util.Scanner;

public class Questao10 {
    public static int MaiorNumero(int[] vetor) {
        if (vetor == null || vetor.length == 0) {
            System.out.println("O vetor está vazio ou é nulo.");
            return Integer.MIN_VALUE;
        }

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o númmero 1: ");
        int num1 = input.nextInt();

        System.out.printf("Digite o númmero 2: ");
        int num2 = input.nextInt();

        System.out.printf("Digite o númmero 3: ");
        int num3 = input.nextInt();

        System.out.printf("Digite o númmero 4: ");
        int num4 = input.nextInt();

        int[] meusNumeros = { num1, num2, num3, num4 };
        int numeroMaximo = MaiorNumero(meusNumeros);

        if (numeroMaximo != Integer.MIN_VALUE) {
            System.out.println("O maior número no vetor é: " + numeroMaximo);
        }
    }
}