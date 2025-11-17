public class GerenciadorImpostoDeRenda {
    private double totalTributos = 0;
    public void adicionar(Tributavel t) {
        totalTributos += t.calculaTributos();
    }
    public double getTotalTributos() {
        return totalTributos;
    }
    public static void main(String[] args) {
        GerenciadorImpostoDeRenda ger = new GerenciadorImpostoDeRenda();
        ContaCorrente cc1 = new ContaCorrente(1000);
        ContaCorrente cc2 = new ContaCorrente(500);
        SeguroDeVida sv = new SeguroDeVida();
        ger.adicionar(cc1);
        ger.adicionar(cc2);
        ger.adicionar(sv);
        System.out.println("Total de tributos: " + ger.getTotalTributos());
    }
}
