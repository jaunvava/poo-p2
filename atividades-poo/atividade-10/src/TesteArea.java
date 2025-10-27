public class TesteArea {
    public static void main(String[] args) {
        AreaCalculavel[] formas = new AreaCalculavel[5];
        formas[0] = new Quadrado(2);
        formas[1] = new Retangulo(3, 4);
        formas[2] = new Circulo(1.5);
        formas[3] = new Quadrado(5);
        formas[4] = new Retangulo(2, 6);
        for (AreaCalculavel f : formas) {
            System.out.println("Área: " + f.calculaArea());
        }
    }
}
