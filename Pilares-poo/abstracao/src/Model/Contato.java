package Model;

public class Contato {
    private String sigla;
    public String nome;
    public String sobreNome;
    public String numero;
    public String email;
    public Endereco endereco;

    public Contato(
            String nome,
            String sobreNome,
            String numero,
            String email
        ){
      this.nome = nome;
      this.sobreNome = sobreNome;
      this.numero = numero;
      this.email = email;
      this.sigla = nome.toLowerCase().substring(0) + sobreNome.toLowerCase().substring(0);
    }

    public boolean ligar(String nome, String sobreNome){
        if (this.numero.length() == 11){
            return true;
        }
        return false;
    }

    public void editarNome(String nome, String sobreNome){
        if (nome.length() == 0){
            System.out.println("Nome invalido, ou incompleto");
        } else {
          this.nome = nome;
        }
        this.sobreNome = sobreNome;

        String sqSn = "";

        if (this.sobreNome.length() > 0){
            sqSn = this.sobreNome.toLowerCase().substring(0);
        }

        this.sigla = this.nome.toLowerCase().substring(0) + sqSn;
    }

    public void editarNumero(String numero){


    }

    public void editarEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public boolean enviarEmail(String mensagem, String assunto){
        if (this.email.isEmpty() || this.email.contains("@")){
            return false;
        }
        System.out.printf("\nAssunto: %s", assunto);
        System.out.printf("\nMensagem: %s", mensagem);
        System.out.printf("\nDestinatario: %s", this.email);
        return true;
    }

    public boolean enviarMensagem(String menssagem){
        if (this.numero.isEmpty() || this.numero.length() < 11){
            return false;
        }
        if (menssagem.isEmpty()){
            return false;
        }
        System.out.printf("\nMensagem: %s", menssagem);
        System.out.printf("\nDestinatario: %s", this.numero);
        return true;
    }

    @Override
    public String toString() {
        return String.format("<Contato: nome = %s, número = %s>",
        this.nome, this.numero);
    }
}
