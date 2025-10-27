// Escreva um programa que solicita ao usuário um índice entre 0 e 4 e exibe o valor
// correspondente do vetor {5, 15, 25, 35, 45}.


import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int[] vetor = {5, 15, 25, 35, 45};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um índice entre 0 e 4: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < vetor.length) {
            System.out.println("O valor no índice " + indice + " é: " + vetor[indice]);
        } else {
            System.out.println("Índice inválido. Por favor, digite um número entre 0 e 4.");
        }
    }
}
