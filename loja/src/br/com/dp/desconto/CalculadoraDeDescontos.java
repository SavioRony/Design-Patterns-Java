package br.com.dp.desconto;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
