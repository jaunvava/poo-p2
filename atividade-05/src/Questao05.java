// Dado um vetor {2, 5, 8, 10, 15, 18}, crie um programa que conta
// quantos números pares existem no vetor e exibe o resultado.

public class Questao05 {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 8, 10, 15, 18};
        int contadorPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("O número de elementos pares no vetor é: " + contadorPares);
    }
}


