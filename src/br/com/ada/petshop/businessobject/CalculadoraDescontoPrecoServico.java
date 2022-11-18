package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.enumeracao.TipoPagamentoEnum;
import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;

public class CalculadoraDescontoPrecoServico {
    // sempre que uma nova foram de pagamento for criada, teremos que adiconar um novo isso
    // nossa clase estará aberta para alterações
    // podendo gerar bugs ao sofrer alterações
    // Podemos aplicar o O do SOLID?
    // O - OCP - Open-Closed Principle - Principio aberto e fechado?
    public void aplicaDesconto(Servico servico, AplicadorDesconto aplicadorDesconto) {
        aplicadorDesconto.aplicaDesconto(servico);
    }
}
