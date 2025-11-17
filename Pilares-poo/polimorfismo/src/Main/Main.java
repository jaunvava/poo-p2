package Main;

import Model.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE POLIMORFISMO EM JAVA ===\n");

        // 1. POLIMORFISMO BASICO
        exemploPolimorfismoBasico();
        
        // 2. POLIMORFISMO COM ARRAYS
        exemploPolimorfismoArrays();
        
        // 3. POLIMORFISMO COM LISTAS
        exemploPolimorfismoListas();
        
        // 4. POLIMORFISMO EM METODOS
        exemploPolimorfismoMetodos();
        
        // 5. CASTING E INSTANCEOF
        exemploCastingInstanceof();
        
        // 6. POLIMORFISMO NA PRATICA
        exemploPolimorfismoPratico();
        
        // 7. POLIMORFISMO COM CASA
        exemploPolimorfismoCasa();
    }

    // Exemplo 1: Demonstra polimorfismo basico com sobrescrita de metodos
    public static void exemploPolimorfismoBasico() {
        System.out.println("1. POLIMORFISMO BASICO:");
        System.out.println("-----------------------");
        
        // Criando objetos de diferentes tipos
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setName("Maria Silva");
        pessoa1.setDoc("12345678901");
        
        Pessoa pessoa2 = new Cliente("Joao Santos", "11111111111", 5000.00);
        Pessoa pessoa3 = new Funcionario("Ana Costa", "22222222222", "Gerente", 8000.00, "Vendas");
        Pessoa pessoa4 = new Visitante("Pedro Lima", "33333333333", "Reuniao de negocios", "TechCorp");
        
        // Polimorfismo: mesmo metodo, comportamentos diferentes
        System.out.println("Chamando toString() - polimorfismo em acao:");
        System.out.println(pessoa1); // Chama toString() da classe Pessoa
        System.out.println(pessoa2); // Chama toString() da classe Cliente
        System.out.println(pessoa3); // Chama toString() da classe Funcionario  
        System.out.println(pessoa4); // Chama toString() da classe Visitante
        
        System.out.println("\nChamando obterTipo() - polimorfismo em acao:");
        System.out.println("Tipo 1: " + pessoa1.obterTipo());
        System.out.println("Tipo 2: " + pessoa2.obterTipo());
        System.out.println("Tipo 3: " + pessoa3.obterTipo());
        System.out.println("Tipo 4: " + pessoa4.obterTipo());
        System.out.println();
    }

    // Exemplo 2: Polimorfismo usando arrays
    public static void exemploPolimorfismoArrays() {
        System.out.println("2. POLIMORFISMO COM ARRAYS:");
        System.out.println("---------------------------");
        
        // Array de referencias da classe pai contendo objetos de classes filhas
        Pessoa[] pessoas = {
            new Cliente("Carlos Oliveira", "44444444444", 15000.00),
            new Funcionario("Lucia Mendes", "55555555555", "Analista", 4500.00, "TI"),
            new Visitante("Roberto Silva", "66666666666", "Entrevista", "StartupXYZ"),
            new Cliente("Sandra Costa", "77777777777", 800.00),
            new Funcionario("Bruno Alves", "88888888888", "Diretor", 15000.00, "Executivo")
        };
        
        System.out.println("Iterando sobre array - polimorfismo automatico:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Pessoa " + (i+1) + ": " + pessoas[i].obterTipo());
            pessoas[i].apresentar(); // Metodo sobrescrito e executado corretamente
            System.out.println();
        }
    }

    // Exemplo 3: Polimorfismo usando listas (Collections)
    public static void exemploPolimorfismoListas() {
        System.out.println("3. POLIMORFISMO COM LISTAS:");
        System.out.println("---------------------------");
        
        List<Pessoa> listaPessoas = new ArrayList<>();
        
        // Adicionando diferentes tipos de pessoas na lista
        listaPessoas.add(new Cliente("Fernando Santos", "99999999999", 25000.00));
        listaPessoas.add(new Funcionario("Patricia Lima", "10101010101", "Coordenadora", 6000.00, "RH"));
        listaPessoas.add(new Visitante("Marcos Pereira", "20202020202", "Apresentacao produto", "InnovaTech"));
        
        System.out.println("Usando enhanced for loop com polimorfismo:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println("- " + pessoa.obterTipo());
            pessoa.apresentar();
            System.out.println();
        }
        
        // Usando streams (Java 8+) com polimorfismo
        System.out.println("Usando streams com polimorfismo:");
        listaPessoas.stream()
                   .forEach(pessoa -> {
                       System.out.println("Stream: " + pessoa.obterTipo());
                   });
        System.out.println();
    }

    // Exemplo 4: Polimorfismo em metodos
    public static void exemploPolimorfismoMetodos() {
        System.out.println("4. POLIMORFISMO EM METODOS:");
        System.out.println("---------------------------");
        
        Cliente cliente = new Cliente("Amanda Rocha", "30303030303", 7500.00);
        Funcionario funcionario = new Funcionario("Diego Martins", "40404040404", "Supervisor", 5500.00, "Operacoes");
        Visitante visitante = new Visitante("Carla Fernandes", "50505050505", "Auditoria", "ConsultoriaABC");
        
        // Passando diferentes tipos para o mesmo metodo - polimorfismo
        processarPessoa(cliente);
        processarPessoa(funcionario);
        processarPessoa(visitante);
        
        System.out.println();
    }
    
    // Metodo que aceita qualquer tipo de Pessoa (polimorfismo)
    public static void processarPessoa(Pessoa pessoa) {
        System.out.println("Processando: " + pessoa.obterTipo());
        pessoa.apresentar();
        
        // Aqui o polimorfismo garante que o metodo correto seja chamado
        // baseado no tipo real do objeto, nao no tipo da referencia
        System.out.println("Representacao: " + pessoa.toString());
        System.out.println("---");
    }

    // Exemplo 5: Casting e instanceof com polimorfismo
    public static void exemploCastingInstanceof() {
        System.out.println("5. CASTING E INSTANCEOF:");
        System.out.println("------------------------");
        
        Pessoa[] pessoas = {
            new Cliente("Thiago Silva", "60606060606", 12000.00),
            new Funcionario("Julia Costa", "70707070707", "Desenvolvedora", 7000.00, "TI"),
            new Visitante("Ricardo Nunes", "80808080808", "Consultoria", "TechSolutions")
        };
        
        for (Pessoa pessoa : pessoas) {
            System.out.println("Analisando: " + pessoa.obterTipo());
            
            // Verificando o tipo real e fazendo casting quando necessario
            if (pessoa instanceof Cliente) {
                Cliente cliente = (Cliente) pessoa;
                System.out.println("  -> Cliente com saldo: R$ " + cliente.getSaldo());
                cliente.consultarSaldo();
                
            } else if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                System.out.println("  -> Funcionario com salario: R$ " + funcionario.getSalario());
                funcionario.trabalhar();
                
            } else if (pessoa instanceof Visitante) {
                Visitante visitante = (Visitante) pessoa;
                System.out.println("  -> Visitante da empresa: " + visitante.getEmpresaOrigem());
                visitante.solicitarAutorizacao();
            }
            System.out.println();
        }
    }

    // Exemplo 6: Polimorfismo na pratica - sistema bancario
    public static void exemploPolimorfismoPratico() {
        System.out.println("6. POLIMORFISMO NA PRATICA:");
        System.out.println("---------------------------");
        
        // Simulando um sistema bancario
        List<Pessoa> pessoasNoBanco = new ArrayList<>();
        
        // Adicionando diferentes tipos de pessoas
        Cliente cliente1 = new Cliente("Helena Souza", "90909090909", 3000.00);
        Cliente cliente2 = new Cliente("Gustavo Lima", "01010101010", 500.00);
        Funcionario funcionario1 = new Funcionario("Isabela Santos", "02020202020", "Caixa", 3500.00, "Atendimento");
        Visitante visitante1 = new Visitante("Eduardo Pereira", "03030303030", "Abertura de conta", "EmpresaXPTO");
        
        pessoasNoBanco.add(cliente1);
        pessoasNoBanco.add(cliente2);
        pessoasNoBanco.add(funcionario1);
        pessoasNoBanco.add(visitante1);
        
        System.out.println("Processamento automatico - polimorfismo em acao:");
        for (Pessoa pessoa : pessoasNoBanco) {
            // Polimorfismo: o metodo correto e chamado automaticamente
            pessoa.apresentar();
            
            // Operacoes especificas baseadas no tipo
            if (pessoa instanceof Cliente) {
                Cliente c = (Cliente) pessoa;
                if (c.getSaldo() > 1000) {
                    System.out.println("  Status: Cliente elegivel para produtos premium");
                } else {
                    System.out.println("  Status: Cliente padrao");
                }
            } else if (pessoa instanceof Funcionario) {
                System.out.println("  Status: Funcionario ativo no sistema");
            } else if (pessoa instanceof Visitante) {
                System.out.println("  Status: Visitante aguardando atendimento");
            }
            System.out.println();
        }
    }

    // Exemplo 7: Polimorfismo com a classe Casa original
    public static void exemploPolimorfismoCasa() {
        System.out.println("7. POLIMORFISMO COM CASA:");
        System.out.println("-------------------------");
        
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();
        Casa casa3 = new Casa();
        
        // Inserindo diferentes tipos de pessoas na casa - polimorfismo
        casa1.inserirPessoa(new Cliente("Rafaela Alves", "04040404040", 8500.00));
        casa2.inserirPessoa(new Funcionario("Leandro Costa", "05050505050", "Contador", 4800.00, "Financeiro"));
        casa3.inserirPessoa(new Visitante("Camila Silva", "06060606060", "Entrega", "LogisticaRapida"));
        
        System.out.println("Casa 1: " + casa1);
        System.out.println("Casa 2: " + casa2);
        System.out.println("Casa 3: " + casa3);
        
        // Demonstrando polimorfismo ao acessar pessoas na casa
        System.out.println("\nApresentacoes das pessoas nas casas:");
        if (casa1.getPessoa() != null) casa1.getPessoa().apresentar();
        if (casa2.getPessoa() != null) casa2.getPessoa().apresentar();
        if (casa3.getPessoa() != null) casa3.getPessoa().apresentar();
        
        System.out.println("\n=== RESUMO DOS CONCEITOS DEMONSTRADOS ===");
        System.out.println("1. ✓ Polimorfismo de Sobrescricao: metodos toString(), obterTipo(), apresentar()");
        System.out.println("2. ✓ Polimorfismo com Arrays: mesmo array, diferentes tipos");
        System.out.println("3. ✓ Polimorfismo com Listas: Collections com heranca");
        System.out.println("4. ✓ Polimorfismo em Parametros: mesmo metodo, tipos diferentes");
        System.out.println("5. ✓ Casting e instanceof: verificacao e conversao segura de tipos");
        System.out.println("6. ✓ Polimorfismo Pratico: sistemas reais com multiplos tipos");
        System.out.println("7. ✓ Ligacao Dinamica: metodo correto executado em tempo de execucao");
        System.out.println("==========================================");
    }
}