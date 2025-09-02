import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                break;

            case '/':
                if (numero2 == 0) {
                    System.out.println("Erro: divisão por zero");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                }
                break;

            default:
                System.out.println("Operação inválida! Use apenas +, -, * ou /.");
                operacaoValida = false;
                break;
        }
    }
}