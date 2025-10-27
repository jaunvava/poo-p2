package Main;

import Model.Pessoa;
import Model.Cliente;
import Model.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE HERANCA EM JAVA ===\n");
        
        // 1. CRIACAO DE OBJETOS E HERANCA BASICA
        exemploHerancaBasica();
        
        // 2. POLIMORFISMO E ARRAYS/LISTAS
        exemploPolimorfismo();
        
        // 3. CASTING E INSTANCEOF
        exemploCastingInstanceof();
        
        // 4. SOBRESCRITA DE MÉTODOS
        exemploSobrescritaMetodos();
        
        // 5. USO DO SUPER
        exemploUsoSuper();
        
        // 6. MÉTODOS ABSTRATOS
        exemploMetodosAbstratos();
        
        // 7. DEMONSTRAÇÃO INTERATIVA
        exemploInterativo();
    }
    
    // Exemplo 1: Demonstra criacao de objetos e heranca basica
    public static void exemploHerancaBasica() {
        System.out.println("1. HERANCA BASICA:");
        System.out.println("------------------");
        
        // Criando objetos das classes filhas
        Cliente cliente1 = new Cliente("João Silva", "12345678901", 1500.50);
        Cliente cliente2 = new Cliente("Maria Santos");
        Cliente cliente3 = new Cliente(987654321);
        
        Vendedor vendedor1 = new Vendedor("Pedro Costa", "98765432100", 3000.00);
        
        System.out.println("Cliente 1: " + cliente1);
        System.out.println("Cliente 2: " + cliente2);
        System.out.println("Cliente 3: " + cliente3);
        System.out.println("Vendedor 1: " + vendedor1);
        System.out.println();
        
        // Demonstrando que as classes filhas herdam metodos da classe pai
        cliente1.setName("Joao Silva Atualizado");
        cliente1.setDoc("11111111111");
        System.out.println("Cliente apos atualizacao: " + cliente1);
        System.out.println();
    }
    
    // Exemplo 2: Demonstra polimorfismo usando arrays e listas
    public static void exemploPolimorfismo() {
        System.out.println("2. POLIMORFISMO:");
        System.out.println("----------------");
        
        // Array de referencias da classe pai contendo objetos das classes filhas
        Pessoa[] pessoas = {
            new Cliente("Ana Oliveira", "11111111111", 2500.00),
            new Vendedor("Carlos Mendes", "22222222222", 4000.00),
            new Cliente("Lucia Ferreira", "33333333333", 800.25),
            new Vendedor("Roberto Alves", "44444444444", 3500.00)
        };
        
        System.out.println("Usando polimorfismo com array:");
        for (Pessoa pessoa : pessoas) {
            // O metodo toString() correto e chamado baseado no tipo real do objeto
            System.out.println(pessoa); // Chamada polimorfica
        }
        
        // Lista tambem funciona com polimorfismo
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Cliente("Bruno Santos", "55555555555", 1200.75));
        listaPessoas.add(new Vendedor("Fernanda Lima", "66666666666", 2800.00));
        
        System.out.println("\nUsando polimorfismo com List:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
        System.out.println();
    }
    
    // Exemplo 3: Demonstra casting e uso do instanceof
    public static void exemploCastingInstanceof() {
        System.out.println("3. CASTING E INSTANCEOF:");
        System.out.println("------------------------");
        
        Pessoa[] pessoas = {
            new Cliente("Diego Souza", "77777777777", 3500.00),
            new Vendedor("Paula Rocha", "88888888888", 4200.00),
            new Cliente("Marcos Oliveira", "99999999999", 750.30)
        };
        
        for (Pessoa pessoa : pessoas) {
            System.out.println("Analisando: " + pessoa);
            
            // Verificando o tipo real do objeto
            if (pessoa instanceof Cliente) {
                // Casting para acessar propriedades específicas da classe Cliente
                Cliente cliente = (Cliente) pessoa;
                System.out.println("  → É um Cliente com saldo: R$ " + cliente.saldo);
                
                // Exemplo de operação específica para Cliente
                if (cliente.saldo > 1000) {
                    System.out.println("  → Cliente VIP (saldo > R$ 1000)");
                } else {
                    System.out.println("  → Cliente padrão");
                }
                
            } else if (pessoa instanceof Vendedor) {
                // Casting para acessar propriedades específicas da classe Vendedor
                Vendedor vendedor = (Vendedor) pessoa;
                System.out.println("  → É um Vendedor com salário: R$ " + vendedor.salario);
                
                // Exemplo de operação específica para Vendedor
                if (vendedor.salario > 4000) {
                    System.out.println("  → Vendedor sênior");
                } else {
                    System.out.println("  → Vendedor júnior");
                }
            }
            System.out.println();
        }
    }
    
    // Exemplo 4: Demonstra sobrescrita de métodos
    public static void exemploSobrescritaMetodos() {
        System.out.println("4. SOBRESCRITA DE MÉTODOS (@Override):");
        System.out.println("--------------------------------------");
        
        Cliente cliente = new Cliente("Eduardo Martins", "12312312312", 2000.00);
        Vendedor vendedor = new Vendedor("Carla Pereira", "32132132132", 3800.00);
        
        System.out.println("Método toString() sobrescrito:");
        System.out.println("Cliente: " + cliente.toString());
        System.out.println("Vendedor: " + vendedor.toString());
        
        System.out.println("\nCada classe filha implementa sua própria versão do toString(),");
        System.out.println("mas reutiliza a implementação da classe pai usando super.toString()");
        System.out.println();
    }
    
    // Exemplo 5: Demonstra uso da palavra-chave super
    public static void exemploUsoSuper() {
        System.out.println("5. USO DA PALAVRA-CHAVE 'super':");
        System.out.println("---------------------------------");
        
        System.out.println("Demonstração através dos construtores:");
        
        // Diferentes construtores que chamam super() implícita ou explicitamente
        Cliente cliente1 = new Cliente("Sandra Costa", "45645645645", 1800.00);
        Cliente cliente2 = new Cliente("Ricardo Nunes");
        Cliente cliente3 = new Cliente(987987987);
        
        System.out.println("Cliente com construtor completo: " + cliente1);
        System.out.println("Cliente só com nome: " + cliente2);
        System.out.println("Cliente só com documento: " + cliente3);
        
        System.out.println("\nTodos os construtores das classes filhas chamam");
        System.out.println("super() para inicializar os atributos da classe pai.");
        System.out.println();
    }
    
    // Exemplo 6: Demonstra métodos abstratos
    public static void exemploMetodosAbstratos() {
        System.out.println("6. MÉTODOS ABSTRATOS:");
        System.out.println("--------------------");
        
        Pessoa[] pessoas = {
            new Cliente("Sofia Rodrigues", "11122233344", 2500.00),
            new Vendedor("Gabriel Santos", "55566677788", 3200.00)
        };
        
        System.out.println("Demonstração de métodos abstratos implementados:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Pessoa: " + pessoa);
            System.out.println("  → Tipo: " + pessoa.obterTipo()); // Método abstrato implementado
            System.out.println("  → Valor Mensal: R$ " + String.format("%.2f", pessoa.calcularValorMensal())); // Método abstrato implementado
            System.out.println();
        }
        
        System.out.println("Nota: Os métodos abstratos na classe pai DEVEM ser implementados");
        System.out.println("pelas classes filhas, garantindo que cada tipo tenha sua própria lógica.");
        System.out.println();
    }
    
    // Exemplo 7: Demonstração interativa com funcionalidades específicas
    public static void exemploInterativo() {
        System.out.println("7. DEMONSTRAÇÃO INTERATIVA:");
        System.out.println("---------------------------");
        
        // Criando um cliente e demonstrando suas operações específicas
        Cliente cliente = new Cliente("Amanda Silva", "99988877766", 1000.00);
        System.out.println("Cliente criado: " + cliente);
        System.out.println();
        
        // Operações bancárias do cliente
        System.out.println("Realizando operações bancárias:");
        cliente.depositar(500.00);
        cliente.sacar(200.00);
        cliente.sacar(2000.00); // Tentativa de saque com saldo insuficiente
        System.out.println("Status final do cliente: " + cliente);
        System.out.println();
        
        // Criando um vendedor e demonstrando suas operações específicas
        Vendedor vendedor = new Vendedor("Thiago Oliveira", "12312312312", 2500.00);
        System.out.println("Vendedor criado: " + vendedor);
        System.out.println();
        
        // Registrando vendas
        System.out.println("Registrando vendas do vendedor:");
        vendedor.registrarVenda(1500.00, 5.0);  // 5% de comissão
        vendedor.registrarVenda(2000.00, 7.0);  // 7% de comissão
        vendedor.registrarVenda(800.00, 3.0);   // 3% de comissão
        vendedor.registrarVenda(1200.00, 6.0);  // 6% de comissão
        vendedor.registrarVenda(900.00, 4.0);   // 4% de comissão
        
        System.out.println("\nStatus final do vendedor: " + vendedor);
        System.out.println();
        vendedor.exibirRelatorio();
        
        System.out.println("\n=== RESUMO DOS CONCEITOS DEMONSTRADOS ===");
        System.out.println("1. ✓ Herança: Cliente e Vendedor herdam de Pessoa");
        System.out.println("2. ✓ Encapsulamento: Atributos privados/protegidos com getters/setters");
        System.out.println("3. ✓ Polimorfismo: Mesmo método (toString) comportamentos diferentes");
        System.out.println("4. ✓ Sobrescrita: @Override em toString() e métodos abstratos");
        System.out.println("5. ✓ Construtores: super() para chamar construtor da classe pai");
        System.out.println("6. ✓ Métodos abstratos: obterTipo() e calcularValorMensal()");
        System.out.println("7. ✓ Casting e instanceof: Verificação e conversão de tipos");
        System.out.println("8. ✓ Métodos específicos: Cada classe tem suas próprias funcionalidades");
        System.out.println("==========================================");
    }
}