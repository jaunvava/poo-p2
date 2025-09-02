import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do 1º bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do 2º bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do 4º bimestre: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println();
        System.out.printf("Média do aluno: %.2f%n", media);

        System.out.print("Situação: ");
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}