import java.util.Scanner;

public class Questao09 {
    public static int somaArray(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
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

        System.out.printf("Digite o númmero 5: ");
        int num5 = input.nextInt();

        int[] vetor = {num1, num2, num3, num4, num5};
        System.out.println(somaArray(vetor));
    }
}
