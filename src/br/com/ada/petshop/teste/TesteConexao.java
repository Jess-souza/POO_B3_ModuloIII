package br.com.ada.petshop.teste;

import br.com.ada.petshop.repository.Conexao;
import br.com.ada.petshop.repository.ConexaoBancoFactory;
import br.com.ada.petshop.repository.ConexaoMySQL;
import br.com.ada.petshop.repository.ConexaoOracle;

public class TesteConexao {

    public static void main(String[] args) {
        ConexaoOracle conexaoOracle = new ConexaoOracle();
        ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
        ConexaoBancoFactory bancoFactory = new ConexaoBancoFactory(conexaoMySQL);
        Conexao conexao = bancoFactory.getConexao();
        System.out.println(conexao);
    }
}
