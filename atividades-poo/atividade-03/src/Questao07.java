import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat currency = NumberFormat.getCurrencyInstance(localeBR);

        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if (salarioAtual <= 280.00) {
            percentualAumento = 20.0;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15.0;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.println("\nResultado do reajuste:");
        System.out.println("Salário antes do reajuste: " + currency.format(salarioAtual));
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: " + currency.format(valorAumento));
        System.out.println("Novo salário após o aumento: " + currency.format(novoSalario));
    }
}