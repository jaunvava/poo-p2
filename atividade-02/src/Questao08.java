import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número a ser verificado: ");
        double numero = scanner.nextDouble();

        System.out.print("Digite o início do intervalo: ");
        double inicio = scanner.nextDouble();
        
        System.out.print("Digite o fim do intervalo: ");
        double fim = scanner.nextDouble();

        if (numero >= inicio && numero <= fim) {
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }
    }
}