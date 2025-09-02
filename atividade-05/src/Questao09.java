//Crie um programa que armazene 5 números em um vetor e peça ao usuário um número.Multiplique
// todos os elementos do vetor por esse número e exiba o vetor resultante.

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números para o vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Vetor original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("Digite o número para multiplicar todos os elementos: ");
        int multiplicador = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * multiplicador;
        }

        System.out.print("Resultado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
    }
}