package br.com.dp.imposto;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{
    public ISS(Imposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
