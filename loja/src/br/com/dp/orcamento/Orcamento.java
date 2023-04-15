package br.com.dp.orcamento;

import br.com.dp.orcamento.situacao.EmAnalise;
import br.com.dp.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeitens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeitens) {
        this.valor = valor;
        this.quantidadeitens = quantidadeitens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }
    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeitens() {
        return quantidadeitens;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setQuantidadeitens(int quantidadeitens) {
        this.quantidadeitens = quantidadeitens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
