package br.com.ada.petshop.repository;

public class ConexaoOracle implements Conexao{

    private String user = "adm";
    private String password = "123";
    private String urlDeConexao = "jdbc:oracle:thin:banco";

    @Override
    public String toString() {
        return "ConexaoOracle{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", urlDeConexao='" + urlDeConexao + '\'' +
                '}';
    }
}