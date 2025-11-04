public class Questao02 {

    private void MathUtils() {
    }

    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }

        if (n == 0) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static boolean verificarSeEPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}