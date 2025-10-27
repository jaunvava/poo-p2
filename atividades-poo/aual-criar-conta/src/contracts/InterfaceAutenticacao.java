package contracts;

public interface InterfaceAutenticacao {
    boolean login(String senha);
    boolean logout();
}