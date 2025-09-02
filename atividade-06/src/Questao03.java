public class Questao03 {
    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maior(10, 20)); // 20
        System.out.println(maior(30, 15)); // 30
    }
}
