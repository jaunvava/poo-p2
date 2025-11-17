import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        boolean formaTriangulo = (lado1 + lado2 > lado3) &&
                                (lado1 + lado3 > lado2) &&
                                (lado2 + lado3 > lado1);

        if (!formaTriangulo) {
            System.out.println("Não forma triângulo");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero: todos os lados iguais");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles: dois lados iguais");
            } else {
                System.out.println("Escaleno: todos os lados diferentes");
            }
        }
    }
}