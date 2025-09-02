public class Questao08 {
    public static boolean ePrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ePrimo(2));   // true
        System.out.println(ePrimo(7));   // true
        System.out.println(ePrimo(9));   // false
        System.out.println(ePrimo(15));  // false
    }
}
