package Modules.User;

import DAO.DAO;
import Enums.EspecieEnum;
import Modules.User.Errors.UsuarioErros;
import Modules.User.Exceptions.UsuarioException;
import Modules.VirtualPet.VirtualPetController;
import Modules.VirtualPet.Exceptions.VirtualPetException;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class UsuarioController {
    private DAO<UsuarioModel> dao;
    private VirtualPetController petController;
    private int idAtual;
    private UsuarioModel usuarioLogado;

    public UsuarioController() {
        this.dao = new DAO<>();
        this.petController = new VirtualPetController();
        this.idAtual = 1;
        this.usuarioLogado = null;
    }

    public boolean possuiPet() {
        return petController.existePet();
    }

    public void sair() {
        if (usuarioLogado != null) {
            usuarioLogado.setLogado(false);
        }
        usuarioLogado = null;
    }

    private boolean verificarUsuarioExistente(String email) {
        List<UsuarioModel> usuarios = dao.retornarTodos();
        for (UsuarioModel usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean inserirUsuario(String nome, String email, String senha) throws UsuarioException {
        // Verificar se o email possui @
        if (!email.contains("@")) {
            throw new UsuarioException(UsuarioErros.emailInvalido);
        }

        // Verificar se a senha possui menos de 8 caracteres
        if (senha.length() < 8) {
            throw new UsuarioException(UsuarioErros.senhaFraca);
        }

        // Verificar se o usuário já existe
        if (verificarUsuarioExistente(email)) {
            throw new UsuarioException(UsuarioErros.emailJaCadastrado);
        }

        // Criar novo usuário
        UsuarioModel novoUsuario = new UsuarioModel(idAtual, nome, email, senha);
        idAtual++;
        
        // Inserir no DAO
        boolean resultado = dao.inserir(novoUsuario);
        
        return resultado;
    }

    public boolean entrar(String emailInformado, String senhaInformada) throws UsuarioException {
        // Codificar a senha informada para comparação
        String senhaEncodificada = Base64.getEncoder().encodeToString(
            senhaInformada.getBytes(StandardCharsets.UTF_8)
        );

        List<UsuarioModel> usuarios = dao.retornarTodos();
        
        for (UsuarioModel usuario : usuarios) {
            if (usuario.getEmail().equals(emailInformado)) {
                // Email encontrado, verificar senha
                if (usuario.getSenha().equals(senhaEncodificada)) {
                    // Credenciais corretas
                    usuario.entrar();
                    usuarioLogado = usuario;
                    
                    // Se o usuário tem pet, carregar no petController
                    if (usuario.getPetVirtual() != null) {
                        try {
                            petController.adotar(
                                usuario.getPetVirtual().getNome(),
                                usuario.getPetVirtual().getEspecie()
                            );
                        } catch (VirtualPetException e) {
                            // Pet já existe, ignorar
                        }
                    }
                    
                    return true;
                } else {
                    // Senha incorreta
                    throw new UsuarioException(UsuarioErros.verifiqueSuasCredenciais);
                }
            }
        }
        
        // Email não encontrado
        throw new UsuarioException(UsuarioErros.verifiqueSuasCredenciais);
    }

    public boolean adotarPet(String nome, EspecieEnum especie) throws UsuarioException, VirtualPetException {
        if (usuarioLogado == null) {
            throw new UsuarioException("Você precisa estar logado para adotar um pet");
        }

        // Verificar se já possui pet
        if (possuiPet()) {
            throw new VirtualPetException(Modules.VirtualPet.Errors.VirtualPetErros.jaPossuiPet);
        }

        // Adotar no controller
        petController.adotar(nome, especie);
        
        // Atualizar no modelo do usuário
        usuarioLogado.adotarPet(petController.getPet());
        
        return true;
    }

    public void removerPet() throws VirtualPetException {
        throw new VirtualPetException(Modules.VirtualPet.Errors.VirtualPetErros.naoPodeAbandonar);
    }

    public void alimentarPet() throws VirtualPetException {
        petController.alimentarPet();
    }

    public void limparPet() throws VirtualPetException {
        petController.limparPet();
    }

    public void brincarComPet() {
        petController.brincarComPet();
    }

    public UsuarioModel meuPet() {
        return usuarioLogado;
    }

    public UsuarioModel getUsuarioLogado() {
        return usuarioLogado;
    }

    public VirtualPetController getPetController() {
        return petController;
    }
}
