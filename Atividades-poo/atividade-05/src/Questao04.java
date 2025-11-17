// Crie um programa que recebe 6 números inteiros do usuário, armazena em um vetor e
// exibe o maior e o menor valor inserido.


import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Insira 6 números inteiros: ");
        for (int n = 0; n < numeros.length; n++) {
            System.out.print("Número " + (n + 1) + ": ");
            numeros[n] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
