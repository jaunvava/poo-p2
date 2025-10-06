import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};

        try {
            System.out.print("Digite o índice do elemento que deseja acessar (0 a 4): ");
            int indice = scanner.nextInt();
            System.out.println("Elemento: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número inteiro.");
        } finally {
            scanner.close();
        }
    }
}
