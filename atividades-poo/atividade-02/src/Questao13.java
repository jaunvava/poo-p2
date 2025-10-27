import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da encomenda (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a distância (km): ");
        double distancia = scanner.nextDouble();

        if (peso <= 0 || distancia <= 0) {
            System.out.println("Erro: Peso e distância devem ser valores positivos!");
        } else {
            double taxaFixa;
            double taxaPorKm;

            if (peso <= 1) {
                taxaFixa = 10.00;
                taxaPorKm = 0.50;
            } else if (peso <= 5) {
                taxaFixa = 15.00;
                taxaPorKm = 0.80;
            } else {
                taxaFixa = 20.00;
                taxaPorKm = 1.00;
            }

            double valorFrete = taxaFixa + (taxaPorKm * distancia);
            System.out.println("\nCálculo do Frete:");
            System.out.printf("Peso: %.2f kg%n", peso);
            System.out.printf("Distância: %.2f km%n", distancia);
            System.out.printf("Taxa fixa: R$ %.2f%n", taxaFixa);
            System.out.printf("Taxa por km: R$ %.2f%n", taxaPorKm);
            System.out.printf("Valor total do frete: R$ %.2f%n", valorFrete);
        }
    }
}