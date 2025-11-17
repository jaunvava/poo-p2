import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quanto você ganha por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR = salarioBruto * 0.11;
        double descontoINSS = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSindicato);

        System.out.printf("+ Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("- IR (11%%): R$ %.2f%n", descontoIR);
        System.out.printf("- INSS (8%%): R$ %.2f%n", descontoINSS);
        System.out.printf("- Sindicato (5%%): R$ %.2f%n", descontoSindicato);
        System.out.printf("= Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}
