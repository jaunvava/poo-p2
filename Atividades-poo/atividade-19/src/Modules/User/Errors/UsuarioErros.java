package Modules.User.Errors;

public final class UsuarioErros {
    public static final String emailJaCadastrado = "Email já cadastrado no sistema";
    public static final String emailInvalido = "Email inválido - deve conter @";
    public static final String senhaFraca = "Senha fraca - deve possuir 8 ou mais caracteres";
    public static final String verifiqueSuasCredenciais = "Verifique suas credenciais";

    private UsuarioErros() {
        // Classe utilitária - construtor privado
    }
}
