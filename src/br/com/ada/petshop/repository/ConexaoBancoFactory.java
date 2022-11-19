package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {
    private Conexao conexao;

    public ConexaoBancoFactory(Conexao conexao){
        this.conexao = conexao;
    }

    public Conexao getConexao() {
        return conexao;
    }
}

