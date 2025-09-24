package Model;

public class Vendedor extends Pessoa {
    public double salario;
    private double comissaoTotal;
    private int vendasRealizadas;

    public Vendedor(String nome, String doc, double salario){
        super(nome, doc);
        this.salario = salario;
        this.comissaoTotal = 0.0;
        this.vendasRealizadas = 0;
    }

    // Método específico da classe Vendedor
    public void registrarVenda(double valorVenda, double percentualComissao) {
        if (valorVenda > 0 && percentualComissao >= 0 && percentualComissao <= 100) {
            double comissao = valorVenda * (percentualComissao / 100);
            this.comissaoTotal += comissao;
            this.vendasRealizadas++;
            System.out.println("Venda registrada! Valor: R$ " + valorVenda + 
                             ", Comissão: R$ " + String.format("%.2f", comissao));
        } else {
            System.out.println("Dados da venda inválidos!");
        }
    }

    // Método específico da classe Vendedor
    public double calcularSalarioTotal() {
        return this.salario + this.comissaoTotal;
    }

    // Método específico da classe Vendedor
    public String obterCategoria() {
        if (this.vendasRealizadas >= 20) {
            return "Vendedor Expert";
        } else if (this.vendasRealizadas >= 10) {
            return "Vendedor Senior";
        } else if (this.vendasRealizadas >= 5) {
            return "Vendedor Pleno";
        } else {
            return "Vendedor Junior";
        }
    }

    // Método específico da classe Vendedor
    public void exibirRelatorio() {
        System.out.println("=== RELATÓRIO DO VENDEDOR ===");
        System.out.println("Salário Base: R$ " + String.format("%.2f", this.salario));
        System.out.println("Comissão Total: R$ " + String.format("%.2f", this.comissaoTotal));
        System.out.println("Salário Total: R$ " + String.format("%.2f", calcularSalarioTotal()));
        System.out.println("Vendas Realizadas: " + this.vendasRealizadas);
        System.out.println("Categoria: " + obterCategoria());
        System.out.println("=============================");
    }

    // Getters e Setters
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissaoTotal() {
        return this.comissaoTotal;
    }

    public int getVendasRealizadas() {
        return this.vendasRealizadas;
    }

    // Implementação do método abstrato da classe pai
    @Override
    public String obterTipo() {
        return "Vendedor Profissional";
    }

    // Implementação do método abstrato da classe pai
    @Override
    public double calcularValorMensal() {
        // Para vendedores, retorna o salário total (base + comissões)
        return calcularSalarioTotal();
    }

    @Override
    public String toString() {
        return String.format("Vendedor{%s, salário=R$ %.2f, comissão=R$ %.2f, vendas=%d, categoria=%s}", 
                super.toString(), this.salario, this.comissaoTotal, this.vendasRealizadas, obterCategoria());
    }
}
