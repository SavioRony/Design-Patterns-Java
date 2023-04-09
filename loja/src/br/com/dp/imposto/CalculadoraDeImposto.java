package br.com.dp.imposto;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
