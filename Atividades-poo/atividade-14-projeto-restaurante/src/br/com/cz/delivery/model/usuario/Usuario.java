package br.com.cz.delivery.model.usuario;

import br.com.cz.delivery.contracts.IAutenticacao;
import br.com.cz.delivery.exceptions.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;


abstract class Usuario implements IAutenticacao {
    private UUID id;
    private String nome;
    private String doc;
    private String email;
    private byte[] senha;
    protected int moedas;
    private boolean logado;

    public Usuario(){
        this.id = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank() || nome.length() < 3){
            throw new NomeInvalidoException();
        }
        this.nome = nome;
    }

    public void setDoc(String doc) {
        if (doc.length() < 11){
            throw new DocumentoInvalidoException();
        }
        this.doc = Base64.getEncoder().encodeToString(doc.getBytes());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.equals("@")){
            this.email = email;
        }
        throw new EmailInvalidoException();
    }

    public void setSenha(String senha) throws NoSuchAlgorithmException {
        if (senha.length() < 8){
            throw new SenhaInvalidaException();
        }
        MessageDigest crypt = MessageDigest.getInstance("MD5");
        this.senha = crypt.digest(senha.getBytes());
    }

    public boolean usuarioValido(){
        return !this.nome.isBlank()
                && !this.doc.isBlank()
                && !this.email.isBlank()
                && this.senha.length == 0;
    }

    @Override
    public boolean login(String senha) {
        MessageDigest crypt = null;
        try {
            crypt = MessageDigest.getInstance("MD5");
            byte[] passValidate = crypt.digest(senha.getBytes());
            boolean statusSenha = Arrays.equals(this.senha, passValidate);
            if (statusSenha){
                this.logado = true;
                return true;
            }
            throw new AutenticacaoException();
        } catch (AutenticacaoException | NoSuchAlgorithmException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean logout() {
        this.logado = false;
        return false;
    }

    public boolean isLogado() {
        return logado;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
