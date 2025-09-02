public class Questao09 {
    public static int somaArray(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(somaArray(vetor));
    }
}
