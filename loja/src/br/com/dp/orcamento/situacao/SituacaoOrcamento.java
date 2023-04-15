package br.com.dp.orcamento.situacao;

import br.com.dp.exception.DomainException;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado");
    }
}
