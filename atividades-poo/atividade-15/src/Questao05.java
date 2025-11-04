public class Questao05 {
    static class Livro {
        private final int codigo;
        private final String titulo;
        private final String autor;
        private boolean disponivel;
        private static int contadorLivros = 0;
        private static final int LIMITE_EMPRESTIMOS = 2;

        public Livro(String titulo, String autor) {
            this.codigo = ++contadorLivros;
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public void setDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }

        public static int getTotalLivros() {
            return contadorLivros;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "codigo=" + codigo +
                    ", titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", disponivel=" + disponivel +
                    '}';
        }
    }

    static class Membro {
        private final int id;
        private String nome;
        private Livro[] livrosEmprestados;
        private int numLivrosEmprestados;
        private static int contadorMembros = 0;

        public Membro(String nome) {
            this.id = ++contadorMembros;
            this.nome = nome;
            this.livrosEmprestados = new Livro[BibliotecaUtil.LIMITE_EMPRESTIMOS];
            this.numLivrosEmprestados = 0;
        }

        public boolean emprestarLivro(Livro livro) {
            if (!BibliotecaUtil.validarEmprestimo(this, livro)) {
                return false;
            }

            livrosEmprestados[numLivrosEmprestados++] = livro;
            livro.setDisponivel(false);
            System.out.println("Empréstimo realizado com sucesso para " + nome);
            return true;
        }

        public boolean devolverLivro(Livro livro) {
            for (int i = 0; i < numLivrosEmprestados; i++) {
                if (livrosEmprestados[i] == livro) {
                    for (int j = i; j < numLivrosEmprestados - 1; j++) {
                        livrosEmprestados[j] = livrosEmprestados[j + 1];
                    }
                    livrosEmprestados[--numLivrosEmprestados] = null;
                    livro.setDisponivel(true);
                    System.out.println("Devolução realizada com sucesso por " + nome);
                    return true;
                }
            }
            System.out.println("Este livro não está emprestado para " + nome);
            return false;
        }

        public int getNumLivrosEmprestados() {
            return numLivrosEmprestados;
        }

        public static int getTotalMembros() {
            return contadorMembros;
        }
    }

    static final class BibliotecaUtil {
        public static final int LIMITE_EMPRESTIMOS = 2;

        private BibliotecaUtil() {
        }

        public static boolean validarEmprestimo(Membro membro, Livro livro) {
            if (!livro.isDisponivel()) {
                System.out.println("Livro não está disponível para empréstimo");
                return false;
            }

            if (membro.getNumLivrosEmprestados() >= LIMITE_EMPRESTIMOS) {
                System.out.println("Membro já atingiu o limite de empréstimos");
                return false;
            }

            return true;
        }
    }

    static class TesteBiblioteca {
        public static void main(String[] args) {

            Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
            Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo");
            Livro livro3 = new Livro("Memórias Póstumas", "Machado de Assis");


            Membro membro1 = new Membro("João Silva");
            Membro membro2 = new Membro("Maria Santos");

            System.out.println("=== TESTANDO EMPRÉSTIMOS ===");
            membro1.emprestarLivro(livro1);
            membro1.emprestarLivro(livro2);
            membro1.emprestarLivro(livro3);

            membro2.emprestarLivro(livro2);

            System.out.println("\n=== TESTANDO DEVOLUÇÕES ===");
            membro1.devolverLivro(livro1);
            membro2.emprestarLivro(livro1);

            System.out.println("\n=== ESTATÍSTICAS ===");
            System.out.println("Total de livros: " + Livro.getTotalLivros());
            System.out.println("Total de membros: " + Membro.getTotalMembros());
            System.out.println("Limite de empréstimos: " + BibliotecaUtil.LIMITE_EMPRESTIMOS);
        }
    }
}
