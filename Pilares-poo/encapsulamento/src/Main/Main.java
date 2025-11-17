package Main;

import Model.Casa;
import Model.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE ENCAPSULAMENTO EM JAVA ===\n");

        // 1. ENCAPSULAMENTO BASICO - PROTECAO DE DADOS
        exemploEncapsulamentoBasico();
        
        // 2. VALIDACOES COM ENCAPSULAMENTO
        exemploValidacoes();
        
        // 3. ENCAPSULAMENTO COM METODOS PRIVADOS
        exemploMetodosPrivados();
        
        // 4. ENCAPSULAMENTO EM CLASSES RELACIONADAS
        exemploEncapsulamentoCasa();
        
        // 5. CONTROLE DE ACESSO E SEGURANCA
        exemploControleAcesso();
        
        // 6. ENCAPSULAMENTO NA PRATICA
        exemploEncapsulamentoPratico();
    }

    // Exemplo 1: Demonstra protecao de dados com encapsulamento
    public static void exemploEncapsulamentoBasico() {
        System.out.println("1. ENCAPSULAMENTO BASICO - PROTECAO DE DADOS:");
        System.out.println("---------------------------------------------");
        
        Pessoa pessoa = new Pessoa();
        
        // ENCAPSULAMENTO: Nao podemos acessar diretamente os atributos privados
        // pessoa.nome = "Teste"; // ERRO! Atributo privado nao acessivel
        // pessoa.idade = -10;    // ERRO! Atributo privado nao acessivel
        
        // Devemos usar os metodos publicos (getters/setters)
        pessoa.setNome("Maria Silva");
        pessoa.setIdade(25);
        pessoa.setDocumento("12345678901");
        pessoa.setEmail("maria@exemplo.com");
        
        System.out.println("Pessoa criada: " + pessoa);
        System.out.println("Nome (via getter): " + pessoa.getNome());
        System.out.println("Idade (via getter): " + pessoa.getIdade());
        System.out.println("Email (via getter): " + pessoa.getEmail());
        
        // ENCAPSULAMENTO: Documento e protegido - so mostra versao oculta
        System.out.println("Documento protegido: " + pessoa.getDocumento());
        
        System.out.println("\nVantagem: Os dados estao protegidos contra acesso direto!\n");
    }

    // Exemplo 2: Demonstra validacoes atraves de encapsulamento
    public static void exemploValidacoes() {
        System.out.println("2. VALIDACOES COM ENCAPSULAMENTO:");
        System.out.println("--------------------------------");
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Tentando inserir dados INVALIDOS:");
        
        // ENCAPSULAMENTO: As validacoes nos setters protegem contra dados invalidos
        pessoa.setNome("");           // Nome vazio - sera rejeitado
        pessoa.setNome("A");          // Nome muito curto - sera rejeitado
        pessoa.setIdade(-5);          // Idade negativa - sera rejeitada
        pessoa.setIdade(200);         // Idade impossivel - sera rejeitada
        pessoa.setDocumento("123");   // Documento invalido - sera rejeitado
        pessoa.setEmail("email_sem_arroba"); // Email invalido - sera rejeitado
        
        System.out.println("\nEstado da pessoa apos tentativas invalidas:");
        System.out.println(pessoa);
        
        System.out.println("\nTentando inserir dados VALIDOS:");
        pessoa.setNome("Joao Santos");
        pessoa.setIdade(30);
        pessoa.setDocumento("98765432100");
        pessoa.setEmail("joao@exemplo.com");
        
        System.out.println("Estado da pessoa apos dados validos:");
        System.out.println(pessoa);
        System.out.println("Classificacao etaria: " + pessoa.getResumoIdade());
        System.out.println("E maior de idade? " + pessoa.isMaiorIdade());
        
        System.out.println("\nVantagem: Validacoes automaticas protegem a integridade dos dados!\n");
    }

    // Exemplo 3: Demonstra uso de metodos privados
    public static void exemploMetodosPrivados() {
        System.out.println("3. ENCAPSULAMENTO COM METODOS PRIVADOS:");
        System.out.println("--------------------------------------");
        
        Pessoa pessoa1 = new Pessoa("Ana Costa", "11122233344", 17, "ana@escola.com");
        Pessoa pessoa2 = new Pessoa("Carlos Silva", "55566677788", 45, "carlos@empresa.com");
        
        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2: " + pessoa2);
        
        // ENCAPSULAMENTO: Metodos publicos que usam logica interna privada
        System.out.println("\nInformacoes processadas internamente:");
        System.out.println("Pessoa 1 - Documento: " + pessoa1.getDocumento()); // Usa metodo privado ocultarDocumento()
        System.out.println("Pessoa 1 - Classificacao: " + pessoa1.getResumoIdade()); // Usa logica interna
        System.out.println("Pessoa 2 - Documento: " + pessoa2.getDocumento());
        System.out.println("Pessoa 2 - Classificacao: " + pessoa2.getResumoIdade());
        
        // Nao podemos acessar o metodo privado diretamente
        // pessoa1.ocultarDocumento("123"); // ERRO! Metodo privado nao acessivel
        
        System.out.println("\nVantagem: Metodos privados escondem complexidade interna!\n");
    }

    // Exemplo 4: Demonstra encapsulamento entre classes relacionadas
    public static void exemploEncapsulamentoCasa() {
        System.out.println("4. ENCAPSULAMENTO EM CLASSES RELACIONADAS:");
        System.out.println("------------------------------------------");
        
        // Criando uma casa com encapsulamento
        Casa casa = new Casa("Rua das Flores, 123", 45, 120.5);
        
        // Criando pessoas
        Pessoa proprietario = new Pessoa("Roberto Lima", "99988877766", 35, "roberto@email.com");
        Pessoa morador1 = new Pessoa("Sandra Lima", "11122233344", 32, "sandra@email.com");
        Pessoa morador2 = new Pessoa("Pedro Lima", "55566677788", 8, "pedro@email.com");
        
        // ENCAPSULAMENTO: Usando metodos controlados para modificar estado interno
        casa.setProprietario(proprietario);
        casa.adicionarMorador(morador1);
        casa.adicionarMorador(morador2);
        
        System.out.println("Casa criada: " + casa);
        System.out.println();
        
        // ENCAPSULAMENTO: Tentando adicionar morador invalido
        System.out.println("Tentando adicionar pessoa sem nome valido:");
        Pessoa pessoaInvalida = new Pessoa();
        casa.adicionarMorador(pessoaInvalida);
        
        // ENCAPSULAMENTO: Metodos publicos que fornecem informacoes controladas
        System.out.println("\nInformacoes da casa (via metodos publicos):");
        System.out.println("Quantidade de moradores: " + casa.getQuantidadeMoradores());
        System.out.println("Area por pessoa: " + String.format("%.2f", casa.calcularAreaPorPessoa()) + " m²");
        System.out.println("Classificacao: " + casa.classificarCasa());
        
        casa.listarMoradores();
        
        System.out.println("\nVantagem: Classes se relacionam de forma controlada e segura!\n");
    }

    // Exemplo 5: Demonstra controle de acesso e seguranca
    public static void exemploControleAcesso() {
        System.out.println("5. CONTROLE DE ACESSO E SEGURANCA:");
        System.out.println("----------------------------------");
        
        Casa casaSegura = new Casa("Av. Principal, 789", 100, 200.0);
        
        Pessoa dono = new Pessoa("Felipe Souza", "12312312312", 40, "felipe@seguro.com");
        casaSegura.setProprietario(dono);
        
        System.out.println("Casa inicial: " + casaSegura);
        
        // ENCAPSULAMENTO: Sistema de alarme controlado
        System.out.println("\nControle do sistema de alarme:");
        System.out.println("Status inicial do alarme: " + casaSegura.isTemAlarme());
        
        casaSegura.ativarAlarme();
        System.out.println("Status apos ativacao: " + casaSegura.isTemAlarme());
        
        casaSegura.desativarAlarme();
        System.out.println("Status apos desativacao: " + casaSegura.isTemAlarme());
        
        // ENCAPSULAMENTO: Nao podemos modificar diretamente o estado interno
        // casaSegura.temAlarme = true; // ERRO! Atributo privado nao acessivel
        
        // ENCAPSULAMENTO: Lista de moradores e protegida
        System.out.println("\nProtecao da lista de moradores:");
        var listaMoradores = casaSegura.getMoradores(); // Retorna copia
        listaMoradores.add(new Pessoa()); // Modifica apenas a copia
        System.out.println("Tentativa de adicionar na copia - Moradores reais: " + casaSegura.getQuantidadeMoradores());
        
        System.out.println("\nVantagem: Estado interno e protegido contra modificacoes nao autorizadas!\n");
    }

    // Exemplo 6: Encapsulamento na pratica - cenario completo
    public static void exemploEncapsulamentoPratico() {
        System.out.println("6. ENCAPSULAMENTO NA PRATICA:");
        System.out.println("-----------------------------");
        
        // Simulando um sistema de condominio
        System.out.println("=== SISTEMA DE CONDOMINIO ===");
        
        Casa[] casasCondominio = new Casa[3];
        
        // Casa 1 - Familia completa
        casasCondominio[0] = new Casa("Rua A, Lote 1", 1, 150.0);
        Pessoa pai = new Pessoa("Mario Santos", "11111111111", 45, "mario@familia.com");
        Pessoa mae = new Pessoa("Julia Santos", "22222222222", 42, "julia@familia.com");
        Pessoa filho = new Pessoa("Lucas Santos", "33333333333", 16, "lucas@escola.com");
        
        casasCondominio[0].setProprietario(pai);
        casasCondominio[0].adicionarMorador(mae);
        casasCondominio[0].adicionarMorador(filho);
        casasCondominio[0].ativarAlarme();
        
        // Casa 2 - Casal jovem
        casasCondominio[1] = new Casa("Rua A, Lote 2", 2, 80.0);
        Pessoa morador1 = new Pessoa("Bruno Silva", "44444444444", 28, "bruno@jovem.com");
        Pessoa morador2 = new Pessoa("Carla Silva", "55555555555", 26, "carla@jovem.com");
        
        casasCondominio[1].setProprietario(morador1);
        casasCondominio[1].adicionarMorador(morador2);
        
        // Casa 3 - Pessoa sozinha
        casasCondominio[2] = new Casa("Rua A, Lote 3", 3, 60.0);
        Pessoa solteiro = new Pessoa("Amanda Costa", "66666666666", 35, "amanda@solo.com");
        
        casasCondominio[2].setProprietario(solteiro);
        casasCondominio[2].ativarAlarme();
        
        // ENCAPSULAMENTO: Processando informacoes de forma controlada
        System.out.println("\nRELATORIO DO CONDOMINIO:");
        for (int i = 0; i < casasCondominio.length; i++) {
            Casa casa = casasCondominio[i];
            System.out.println("\n--- CASA " + (i+1) + " ---");
            System.out.println(casa);
            System.out.println("Area por morador: " + String.format("%.1f", casa.calcularAreaPorPessoa()) + " m²");
            
            // ENCAPSULAMENTO: Usando metodos publicos para acessar informacoes
            if (casa.getQuantidadeMoradores() > 0) {
                casa.listarMoradores();
            }
        }
        
        System.out.println("\n=== RESUMO DOS CONCEITOS DEMONSTRADOS ===");
        System.out.println("1. ✓ Atributos Privados: Protegem dados internos");
        System.out.println("2. ✓ Getters/Setters: Controlam acesso aos dados");
        System.out.println("3. ✓ Validacoes: Garantem integridade dos dados");
        System.out.println("4. ✓ Metodos Privados: Escondem complexidade interna");
        System.out.println("5. ✓ Controle de Estado: Impedem modificacoes diretas");
        System.out.println("6. ✓ Protecao de Colecoes: Retornam copias quando necessario");
        System.out.println("7. ✓ Interface Publica: Fornece acesso controlado as funcionalidades");
        System.out.println("==========================================");
    }
}