package Model;

public class Pessoa {
    // ENCAPSULAMENTO: Atributos privados protegem os dados
    private String nome;
    private String documento;
    private int idade;
    private String email;
    
    // Construtor padrao
    public Pessoa() {}
    
    // Construtor com parametros - ENCAPSULAMENTO: Controle na criacao do objeto
    public Pessoa(String nome, String documento, int idade, String email) {
        this.setNome(nome);        // Usa setter para validacao
        this.setDocumento(documento);
        this.setIdade(idade);
        this.setEmail(email);
    }

    // ENCAPSULAMENTO: Getter publico para nome com validacao
    public String getNome() {
        return this.nome != null ? this.nome : "Nome nao informado";
    }
    
    // ENCAPSULAMENTO: Setter publico para nome COM VALIDACAO
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty() && nome.length() >= 2) {
            this.nome = nome.trim();
        } else {
            System.out.println("ERRO: Nome deve ter pelo menos 2 caracteres!");
        }
    }

    // ENCAPSULAMENTO: Getter para documento que PROTEGE informacoes sensiveis
    public String getDocumento() {
        return this.documento != null ? ocultarDocumento(this.documento) : "Documento nao informado";
    }
    
    // ENCAPSULAMENTO: Setter para documento COM VALIDACAO
    public void setDocumento(String documento) {
        if (documento != null && documento.replaceAll("[^0-9]", "").length() == 11) {
            this.documento = documento.replaceAll("[^0-9]", ""); // Remove caracteres especiais
        } else {
            System.out.println("ERRO: Documento deve ter exatamente 11 digitos!");
        }
    }

    // ENCAPSULAMENTO: Getter publico para idade
    public int getIdade() {
        return this.idade;
    }
    
    // ENCAPSULAMENTO: Setter para idade COM VALIDACAO
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        } else {
            System.out.println("ERRO: Idade deve estar entre 0 e 150 anos!");
        }
    }

    // ENCAPSULAMENTO: Getter publico para email
    public String getEmail() {
        return this.email != null ? this.email : "Email nao informado";
    }
    
    // ENCAPSULAMENTO: Setter para email COM VALIDACAO
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email.toLowerCase().trim();
        } else {
            System.out.println("ERRO: Email deve ter formato valido (exemplo@dominio.com)!");
        }
    }

    // ENCAPSULAMENTO: Metodo PRIVADO para processar documento (nao acessivel externamente)
    private String ocultarDocumento(String doc) {
        if (doc != null && doc.length() == 11) {
            return doc.substring(0, 3) + ".***.***-" + doc.substring(9);
        }
        return doc;
    }
    
    // ENCAPSULAMENTO: Metodo publico que usa metodo privado internamente
    public String getDocumentoCompleto() {
        // Este metodo pode ser usado internamente para operacoes que precisam do documento completo
        return this.documento;
    }
    
    // ENCAPSULAMENTO: Metodo publico para validar se a pessoa e maior de idade
    public boolean isMaiorIdade() {
        return this.idade >= 18;
    }
    
    // ENCAPSULAMENTO: Metodo publico que usa dados internos de forma controlada
    public String getResumoIdade() {
        if (this.idade < 13) {
            return "Crianca";
        } else if (this.idade < 18) {
            return "Adolescente";
        } else if (this.idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", documento='" + getDocumento() + '\'' +
                ", idade=" + getIdade() + " anos (" + getResumoIdade() + ")" +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
