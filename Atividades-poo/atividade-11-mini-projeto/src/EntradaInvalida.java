import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaInvalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            int valor = sc.nextInt();
            System.out.println("Valor digitado: " + valor);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é inteiro!");
        }
        sc.close();
    }
}
