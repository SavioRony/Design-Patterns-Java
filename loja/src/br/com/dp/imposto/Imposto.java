package br.com.dp.imposto;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
