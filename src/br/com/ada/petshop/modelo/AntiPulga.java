package br.com.ada.petshop.modelo;

public class AntiPulga implements ProdutoComBula {

    private String fornecedor;
    private String bula;

    @Override
    public String getFornecedor() {
        return null;
    }

    @Override
    public void setFornecedor(String fornecedor) {

    }

    @Override
    public String getBula() {
        return null;
    }

    @Override
    public void setBula(String bula) {
    }

    @Override
    public String toString() {
        return "AntiPulga{" +
                "fornecedor='" + fornecedor + '\'' +
                ", bula='" + bula + '\'' +
                '}';
    }
}
