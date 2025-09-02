public class Questao06 {
    public static int somaAte(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println(somaAte(5));
        System.out.println(somaAte(10));
    }
}
