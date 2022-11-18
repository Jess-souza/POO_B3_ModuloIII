package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.CalculadoraDescontoPrecoServico;
import br.com.ada.petshop.businessobject.DescontoCredito;
import br.com.ada.petshop.businessobject.DescontoDebito;
import br.com.ada.petshop.businessobject.DescontoTED;
import br.com.ada.petshop.enumeracao.TipoPagamentoEnum;
import br.com.ada.petshop.enumeracao.TipoServicoEnum;
import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteCalculoServico {

    public static void main(String[] args) {
        Servico tosa = new Servico();
        tosa.setValor(new BigDecimal(100.00));
        tosa.setTipoServico(TipoServicoEnum.TOSA);

        Servico banho = new Servico();
        banho.setValor(new BigDecimal(50.00));
        banho.setTipoServico(TipoServicoEnum.BANHO);

        Servico banho2 = new Servico();
        banho2.setValor(new BigDecimal(50.00));
        banho2.setTipoServico(TipoServicoEnum.BANHO);

        Pagamento pagamentoDebito = new Pagamento();
        pagamentoDebito.setTipoPagamento(TipoPagamentoEnum.DEBITO);

        Pagamento pagamentoCredito = new Pagamento();
        pagamentoCredito.setTipoPagamento(TipoPagamentoEnum.CREDITO);

        CalculadoraDescontoPrecoServico calc = new CalculadoraDescontoPrecoServico();
        System.out.println("Valor anterior tosa: " + getValorFormatado(tosa.getValor()));
        DescontoCredito descontoCredito = new DescontoCredito();
        calc.aplicaDesconto(tosa, descontoCredito);
        System.out.println("Valor do tosa com desconto: " + getValorFormatado(tosa.getValor()));

        System.out.println("Valor anterior banho: " + getValorFormatado(banho.getValor()));
        DescontoDebito descontoDebito = new DescontoDebito();
        calc.aplicaDesconto(banho, descontoDebito);
        System.out.println("Valor do banho com desconto em débito: " + getValorFormatado(banho.getValor()));

        System.out.println("Valor anterior banho: " + getValorFormatado(banho2.getValor()));
        DescontoTED descontoTED = new DescontoTED();
        calc.aplicaDesconto(banho2, descontoTED);
        System.out.println("Valor do banho com desconto TED: " + getValorFormatado(banho2.getValor()));
    }

    private static String getValorFormatado(BigDecimal valor) {
        String valorFormatado = NumberFormat
                .getCurrencyInstance(new Locale("pt", "br"))
                .format(valor);

        return valorFormatado;
    }
}
