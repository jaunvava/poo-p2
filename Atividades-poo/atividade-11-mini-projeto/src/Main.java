public class Main {
    public static void main(String[] args) {
        System.out.println("Mini-projeto de Tratamento de Erros e Exceções");
        System.out.println("Executando exemplos:");

        System.out.println("\n1. Divisão por Zero:");
        try {
            int a = 10, b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        }

        System.out.println("\n2. Entrada Inválida:");
        try {
            String valor = "abc";
            int num = Integer.parseInt(valor);
            System.out.println("Valor: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor informado não é inteiro!");
        }

        System.out.println("\n3. Acesso a Array fora do limite:");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do limite do array!");
        }

        System.out.println("\n4. String Nula:");
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("A string é nula!");
        }

        System.out.println("\n5. Média de Notas:");
        double[] notas = {8.5, 11, 7};
        try {
            for (double nota : notas) {
                if (nota < 0 || nota > 10) {
                    throw new IllegalArgumentException("Nota inválida! As notas devem estar entre 0 e 10.");
                }
            }
            double media = (notas[0] + notas[1] + notas[2]) / 3.0;
            System.out.printf("Média: %.2f\n", media);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim do cálculo.");
        }
    }
}
