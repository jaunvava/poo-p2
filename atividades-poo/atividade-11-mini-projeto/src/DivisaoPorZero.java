import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o numerador: ");
            int a = sc.nextInt();
            System.out.print("Digite o denominador: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida!");
        }
        sc.close();
    }
}
