package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {
    private ConexaoOracle conexaoOracle;

    public ConexaoBancoFactory(){
        this.conexaoOracle = new ConexaoOracle();
    }

    public ConexaoOracle getConexao() {
        return conexaoOracle;
    }
}

