import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorSeguro {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            while (true) {
                System.out.print("Digite um valor inteiro (0 para parar): ");
                int valor = sc.nextInt();
                vetor[i] = valor;
                i++;
                if (valor == 0) break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Mais de 10 valores informados!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico!");
        }
        System.out.print("Valores digitados: ");
        for (int j = 0; j < i && j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
        System.out.println();
        sc.close();
    }
}
