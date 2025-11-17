import Controller.AmbienteController;
import Controller.ZoologicoController;
import Exception.AmbienteException;
import Exception.ZoologicoException;
import Model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gerenciamento de Zoológico ===\n");

        // Inicializar controllers
        ZoologicoController zoologicoController = new ZoologicoController();
        AmbienteController ambienteController = new AmbienteController();

        try {
            // 1. Criar Zoológico
            System.out.println("1. Criando Zoológico...");
            Zoologico zoo = new Zoologico(
                    0,
                    "Zoo Safari Brasil",
                    "São Paulo - SP",
                    "08:00 - 18:00",
                    50.00
            );
            zoologicoController.adicionar(zoo);
            System.out.println();

            // 2. Criar Ambientes
            System.out.println("2. Criando Ambientes...");
            Ambiente savana = new Ambiente(0, "Savana Africana", 10, 5000.0, 28.0);
            Ambiente aquario = new Ambiente(0, "Aquário Marinho", 15, 3000.0, 22.0);
            Ambiente floresta = new Ambiente(0, "Floresta Tropical", 12, 4000.0, 25.0);
            Ambiente reptilario = new Ambiente(0, "Reptilário", 8, 1500.0, 30.0);

            ambienteController.adicionar(savana);
            ambienteController.adicionar(aquario);
            ambienteController.adicionar(floresta);
            ambienteController.adicionar(reptilario);
            System.out.println();

            // 3. Adicionar ambientes ao zoológico
            System.out.println("3. Adicionando ambientes ao zoológico...");
            zoologicoController.adicionarAmbiente(zoo.getId(), savana);
            zoologicoController.adicionarAmbiente(zoo.getId(), aquario);
            zoologicoController.adicionarAmbiente(zoo.getId(), floresta);
            zoologicoController.adicionarAmbiente(zoo.getId(), reptilario);
            System.out.println();

            // 4. Criar Animais
            System.out.println("4. Criando Animais...");
            
            // Mamíferos
            Mamifero leao = new Mamifero(1, "Simba", 5, "Panthera leo", 190.0, 
                    "Carnívoro", "Pelagem curta e dourada", 110);
            Mamifero elefante = new Mamifero(2, "Dumbo", 15, "Loxodonta africana", 5000.0,
                    "Herbívoro", "Pele grossa e cinza", 645);

            // Aves
            Ave arara = new Ave(3, "Blue", 3, "Ara ararauna", 1.2,
                    "Frugívoro", 1.2, true);
            Ave pinguim = new Ave(4, "Pingu", 4, "Aptenodytes forsteri", 25.0,
                    "Carnívoro", 0.6, false);

            // Répteis
            Reptil cobra = new Reptil(5, "Nagini", 2, "Python reticulatus", 75.0,
                    "Carnívoro", false, "Escamas lisas");
            Reptil jacare = new Reptil(6, "Gatorade", 8, "Caiman latirostris", 50.0,
                    "Carnívoro", false, "Escamas placóides");

            // Peixes
            Peixe tubarao = new Peixe(7, "Bruce", 10, "Carcharodon carcharias", 680.0,
                    "Carnívoro", "Salgada", 1200.0);
            Peixe peixePalhaco = new Peixe(8, "Nemo", 2, "Amphiprion ocellaris", 0.25,
                    "Onívoro", "Salgada", 15.0);

            // Anfíbios
            Anfibio sapo = new Anfibio(9, "Froggy", 1, "Rhinella marina", 0.5,
                    "Carnívoro", true, "Ambos");

            System.out.println("Animais criados com sucesso!");
            System.out.println();

            // 5. Adicionar animais aos ambientes
            System.out.println("5. Adicionando animais aos ambientes...");
            ambienteController.adicionarAnimal(savana.getId(), leao);
            ambienteController.adicionarAnimal(savana.getId(), elefante);
            
            ambienteController.adicionarAnimal(aquario.getId(), tubarao);
            ambienteController.adicionarAnimal(aquario.getId(), peixePalhaco);
            ambienteController.adicionarAnimal(aquario.getId(), pinguim);
            
            ambienteController.adicionarAnimal(floresta.getId(), arara);
            ambienteController.adicionarAnimal(floresta.getId(), sapo);
            
            ambienteController.adicionarAnimal(reptilario.getId(), cobra);
            ambienteController.adicionarAnimal(reptilario.getId(), jacare);
            System.out.println();

            // 6. Exibir estatísticas do zoológico
            System.out.println("6. Estatísticas do Zoológico:");
            zoologicoController.exibirEstatisticas(zoo.getId());

            // 7. Exibir informações dos ambientes
            System.out.println("7. Informações dos Ambientes:");
            ambienteController.exibirInformacoes(savana.getId());
            ambienteController.exibirInformacoes(aquario.getId());

            // 8. Demonstrar comportamentos dos animais
            System.out.println("8. Demonstrando comportamentos dos animais:");
            System.out.println("\n--- Mamíferos ---");
            leao.emitirSom();
            leao.alimentar();
            
            System.out.println("\n--- Aves ---");
            arara.emitirSom();
            arara.voar();
            pinguim.voar();
            
            System.out.println("\n--- Répteis ---");
            cobra.emitirSom();
            cobra.rastejar();
            
            System.out.println("\n--- Peixes ---");
            tubarao.emitirSom();
            tubarao.nadar();
            
            System.out.println("\n--- Anfíbios ---");
            sapo.emitirSom();
            sapo.saltar();
            System.out.println();

            // 9. Listar todos os ambientes disponíveis
            System.out.println("9. Ambientes com espaço disponível:");
            for (Ambiente ambiente : ambienteController.buscarAmbientesDisponiveis()) {
                System.out.println("  - " + ambiente.getTipoAmbiente() + 
                        " (Ocupação: " + ambiente.getQuantidadeAnimais() + "/" + ambiente.getCapacidade() + ")");
            }
            System.out.println();

            // 10. Testar exceções
            System.out.println("10. Testando tratamento de exceções:");
            
            try {
                System.out.println("\nTentando adicionar animal em ambiente lotado...");
                Ambiente ambientePequeno = new Ambiente(0, "Teste Pequeno", 1, 100.0, 25.0);
                ambienteController.adicionar(ambientePequeno);
                ambienteController.adicionarAnimal(ambientePequeno.getId(), leao);
                ambienteController.adicionarAnimal(ambientePequeno.getId(), elefante); // Deve lançar exceção
            } catch (AmbienteException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }

            try {
                System.out.println("\nTentando criar zoológico sem nome...");
                Zoologico zooInvalido = new Zoologico(0, "", "Local", "08:00-17:00", 30.0);
                zoologicoController.adicionar(zooInvalido); // Deve lançar exceção
            } catch (ZoologicoException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }

            try {
                System.out.println("\nTentando buscar zoológico inexistente...");
                zoologicoController.buscar(999); // Deve lançar exceção
            } catch (ZoologicoException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }

            System.out.println("\n=== Sistema executado com sucesso! ===");

        } catch (ZoologicoException | AmbienteException e) {
            System.err.println("Erro no sistema: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
