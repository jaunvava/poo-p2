package Model;

public class Endereco {
    public String rua;
    public String numeroCasa;
    public String bairro;
    public String cep;

    public Endereco(
            String cep,
            String bairro,
            String numeroCasa,
            String rua
        ){
        this.cep = cep;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
        this.rua = rua;
    }

    public void editarRua(String rua) {
        this.rua = rua;
    }

    public void editarNumeroCasa(String bairro) {
        this.bairro = bairro;
    }

    public void editarCep(String cep) {
        this.cep= cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}