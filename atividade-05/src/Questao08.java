//Dado um vetor {1, 2, 3, 4, 5}, escreva um código que inverta a ordem dos elementos
//e exiba o vetor invertido.

public class Questao08 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int[] vetorInvertido = new int[vetor.length];

        for (int v = 0; v < vetor.length; v++) {
            vetorInvertido[v] = vetor[vetor.length - 1 - v];
        }

        System.out.println("\nVetor invertido:");
        for (int i = 0; i < vetorInvertido.length; i++) {
            System.out.print(vetorInvertido[i] + " ");
        }
    }
}