package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;

public class DescontoTED implements AplicadorDesconto {
    @Override
    public void aplicaDesconto(Servico servico) {
        BigDecimal valorComDesconto = servico.getValor().subtract(new BigDecimal(3.0));
        servico.setValor(valorComDesconto);
    }
}
