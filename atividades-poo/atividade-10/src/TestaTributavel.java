public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        SeguroDeVida sv = new SeguroDeVida();
        ContaPoupanca cp = new ContaPoupanca(2000);
        System.out.println("Tributo ContaCorrente: " + cc.calculaTributos());
        System.out.println("Tributo SeguroDeVida: " + sv.calculaTributos());
    }
}
