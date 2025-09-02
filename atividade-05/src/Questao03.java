// Dado um vetor de inteiros com valores {3, 7, 1, 9, 12}, escreva um código
// que some todos os elementos e exiba o resultado.

public class Questao03 {
    public static void main(String[] args) {
        int[] inteiros = {3, 7, 1, 9, 12};
        int soma = 0;

        for (int e = 0; e < inteiros.length; e++) {
            soma = soma + inteiros[e];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}