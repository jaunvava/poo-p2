public class StringSeguro {
    public static void main(String[] args) {
        String texto = null;
        try {
            System.out.println("Tamanho da string: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("A string é nula!");
        }
    }
}
