package br.com.ada.petshop.modelo;

public class Atendente extends Pessoa implements Autenticavel{

    private String senha;
    private String login;
    public Atendente(String nome, Endereco endereco) {
        super(nome, endereco);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getSenha() {
        return senha;
    }
}
