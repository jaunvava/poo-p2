// Peça ao usuário para digitar um número e verifique se ele está presente no
// vetor {4, 8, 15, 16, 23, 42}. Exiba uma mensagem informando se o número foi encontrado ou não.

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {4, 8, 15, 16, 23, 42};

        System.out.print("Digite um número: ");
        int numeroUsuario = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroUsuario) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroUsuario + " foi encontrado no vetor!");
        } else {
            System.out.println("O número " + numeroUsuario + " não foi encontrado no vetor.");
        }
    }
}