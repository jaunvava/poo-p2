public class Questao01 {
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(ePar(10)); // true
        System.out.println(ePar(7));  // false
    }
}
