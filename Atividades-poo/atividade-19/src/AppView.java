import Enums.EspecieEnum;
import Modules.User.Exceptions.UsuarioException;
import Modules.User.UsuarioController;
import Modules.VirtualPet.Exceptions.VirtualPetException;
import Utils.MenuUtil;

public class AppView {
    private UsuarioController usuarioController;
    private boolean executando;

    public AppView() {
        this.usuarioController = new UsuarioController();
        this.executando = true;
    }

    public void iniciar() {
        MenuUtil.exibirCabecalho("BEM-VINDO AO BICHINHO VIRTUAL!");
        
        while (executando) {
            if (usuarioController.getUsuarioLogado() == null) {
                menuPrincipal();
            } else {
                menuUsuario();
            }
        }
        
        MenuUtil.exibirMensagem("\nObrigado por usar o Bichinho Virtual! Até logo!");
    }

    private void menuPrincipal() {
        MenuUtil.exibirCabecalho("MENU PRINCIPAL");
        System.out.println("1. Cadastrar novo usuário");
        System.out.println("2. Entrar");
        System.out.println("0. Sair");
        
        int opcao = MenuUtil.lerInteiro("\nEscolha uma opção: ");
        
        switch (opcao) {
            case 1:
                cadastrarUsuario();
                break;
            case 2:
                entrarUsuario();
                break;
            case 0:
                executando = false;
                break;
            default:
                MenuUtil.exibirErro("Opção inválida!");
                MenuUtil.pausar();
        }
    }

    private void cadastrarUsuario() {
        MenuUtil.exibirCabecalho("CADASTRAR NOVO USUÁRIO");
        
        String nome = MenuUtil.lerString("Nome: ");
        String email = MenuUtil.lerString("Email: ");
        String senha = MenuUtil.lerString("Senha (mínimo 8 caracteres): ");
        
        try {
            boolean sucesso = usuarioController.inserirUsuario(nome, email, senha);
            if (sucesso) {
                MenuUtil.exibirSucesso("Usuário cadastrado com sucesso!");
            } else {
                MenuUtil.exibirErro("Falha ao cadastrar usuário.");
            }
        } catch (UsuarioException e) {
            MenuUtil.exibirErro(e.getMessage());
        }
        
        MenuUtil.pausar();
    }

    private void entrarUsuario() {
        MenuUtil.exibirCabecalho("ENTRAR");
        
        String email = MenuUtil.lerString("Email: ");
        String senha = MenuUtil.lerString("Senha: ");
        
        try {
            boolean sucesso = usuarioController.entrar(email, senha);
            if (sucesso) {
                MenuUtil.exibirSucesso("Login realizado com sucesso!");
                MenuUtil.exibirMensagem("Bem-vindo, " + usuarioController.getUsuarioLogado().getNome() + "!");
                MenuUtil.pausar();
            }
        } catch (UsuarioException e) {
            MenuUtil.exibirErro(e.getMessage());
            MenuUtil.pausar();
        }
    }

    private void menuUsuario() {
        MenuUtil.exibirCabecalho("MENU DO USUÁRIO - " + usuarioController.getUsuarioLogado().getNome());
        
        if (usuarioController.possuiPet()) {
            System.out.println("🐾 Seu Pet: " + usuarioController.getPetController().getPet().getNome() +
                             " (" + usuarioController.getPetController().getPet().getEspecie() + ")");
            System.out.println("   Fome: " + (usuarioController.getPetController().statusFome() ? "😢 Com fome" : "😊 Alimentado"));
            System.out.println("   Limpeza: " + (usuarioController.getPetController().statusLimpeza() ? "💩 Sujo" : "✨ Limpo"));
            System.out.println();
        }
        
        System.out.println("1. Adotar um pet");
        System.out.println("2. Alimentar pet");
        System.out.println("3. Limpar pet");
        System.out.println("4. Brincar com pet");
        System.out.println("5. Ver meu pet");
        System.out.println("6. Remover pet");
        System.out.println("0. Sair");
        
        int opcao = MenuUtil.lerInteiro("\nEscolha uma opção: ");
        
        switch (opcao) {
            case 1:
                adotarPet();
                break;
            case 2:
                alimentarPet();
                break;
            case 3:
                limparPet();
                break;
            case 4:
                brincarComPet();
                break;
            case 5:
                verMeuPet();
                break;
            case 6:
                removerPet();
                break;
            case 0:
                usuarioController.sair();
                MenuUtil.exibirSucesso("Logout realizado com sucesso!");
                MenuUtil.pausar();
                break;
            default:
                MenuUtil.exibirErro("Opção inválida!");
                MenuUtil.pausar();
        }
    }

    private void adotarPet() {
        MenuUtil.exibirCabecalho("ADOTAR PET");
        
        if (usuarioController.possuiPet()) {
            MenuUtil.exibirErro("Você já possui um pet!");
            MenuUtil.pausar();
            return;
        }
        
        String nome = MenuUtil.lerString("Nome do pet: ");
        
        System.out.println("\nEspécies disponíveis:");
        System.out.println("1. GATO");
        System.out.println("2. CACHORRO");
        System.out.println("3. COELHO");
        System.out.println("4. PASSARO");
        System.out.println("5. PEIXE");
        
        int opcaoEspecie = MenuUtil.lerInteiro("\nEscolha a espécie: ");
        
        EspecieEnum especie = null;
        switch (opcaoEspecie) {
            case 1:
                especie = EspecieEnum.GATO;
                break;
            case 2:
                especie = EspecieEnum.CACHORRO;
                break;
            case 3:
                especie = EspecieEnum.COELHO;
                break;
            case 4:
                especie = EspecieEnum.PASSARO;
                break;
            case 5:
                especie = EspecieEnum.PEIXE;
                break;
            default:
                MenuUtil.exibirErro("Espécie inválida!");
                MenuUtil.pausar();
                return;
        }
        
        try {
            usuarioController.adotarPet(nome, especie);
            MenuUtil.exibirSucesso("Pet adotado com sucesso! 🎉");
            MenuUtil.exibirMensagem("Cuide bem do(a) " + nome + "!");
        } catch (UsuarioException | VirtualPetException e) {
            MenuUtil.exibirErro(e.getMessage());
        }
        
        MenuUtil.pausar();
    }

    private void alimentarPet() {
        MenuUtil.exibirCabecalho("ALIMENTAR PET");
        
        if (!usuarioController.possuiPet()) {
            MenuUtil.exibirErro("Você não possui um pet! Adote um primeiro.");
            MenuUtil.pausar();
            return;
        }
        
        try {
            usuarioController.alimentarPet();
            MenuUtil.exibirSucesso("Pet alimentado com sucesso! 🍖");
        } catch (VirtualPetException e) {
            MenuUtil.exibirErro(e.getMessage());
        }
        
        MenuUtil.pausar();
    }

    private void limparPet() {
        MenuUtil.exibirCabecalho("LIMPAR PET");
        
        if (!usuarioController.possuiPet()) {
            MenuUtil.exibirErro("Você não possui um pet! Adote um primeiro.");
            MenuUtil.pausar();
            return;
        }
        
        try {
            usuarioController.limparPet();
            MenuUtil.exibirSucesso("Pet limpo com sucesso! 🛁");
        } catch (VirtualPetException e) {
            MenuUtil.exibirErro(e.getMessage());
        }
        
        MenuUtil.pausar();
    }

    private void brincarComPet() {
        MenuUtil.exibirCabecalho("BRINCAR COM PET");
        
        if (!usuarioController.possuiPet()) {
            MenuUtil.exibirErro("Você não possui um pet! Adote um primeiro.");
            MenuUtil.pausar();
            return;
        }
        
        usuarioController.brincarComPet();
        MenuUtil.pausar();
    }

    private void verMeuPet() {
        MenuUtil.exibirCabecalho("MEU PET");
        
        if (!usuarioController.possuiPet()) {
            MenuUtil.exibirErro("Você não possui um pet! Adote um primeiro.");
            MenuUtil.pausar();
            return;
        }
        
        var pet = usuarioController.getPetController().getPet();
        System.out.println("\n🐾 Nome: " + pet.getNome());
        System.out.println("📋 Espécie: " + pet.getEspecie());
        System.out.println("🍖 Fome: " + (pet.isFome() ? "Com fome 😢" : "Alimentado 😊"));
        System.out.println("🛁 Limpeza: " + (pet.isSujo() ? "Sujo 💩" : "Limpo ✨"));
        
        MenuUtil.pausar();
    }

    private void removerPet() {
        MenuUtil.exibirCabecalho("REMOVER PET");
        
        if (!usuarioController.possuiPet()) {
            MenuUtil.exibirErro("Você não possui um pet!");
            MenuUtil.pausar();
            return;
        }
        
        try {
            usuarioController.removerPet();
        } catch (VirtualPetException e) {
            MenuUtil.exibirErro(e.getMessage());
        }
        
        MenuUtil.pausar();
    }
}
