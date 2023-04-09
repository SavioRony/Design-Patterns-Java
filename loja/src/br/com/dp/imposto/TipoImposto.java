package br.com.dp.imposto;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public enum TipoImposto {
    ICMS{
        @Override
        public BigDecimal calcular(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
    },
    ISS {
        @Override
        public BigDecimal calcular(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.06"));
        }
    };

    public abstract BigDecimal calcular(Orcamento orcamento);
}
