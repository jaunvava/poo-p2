public interface IBiblioteca {
    Livro buscarLivroPorCodigo(String codigoLivro);
    boolean inserir(Livro livro);
    boolean removerLivroPorCodigo(String codigoLivro);
    boolean emprestar(String codigoLivro);
    boolean devolver(String codigoLivro);
    boolean reservar(String codigoLivro);
    EnumDisponibilidadeLivro verificarDisponibilidade(String codigoLivro);
}
