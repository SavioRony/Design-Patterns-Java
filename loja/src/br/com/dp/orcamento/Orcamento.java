package br.com.dp.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeitens;

    public Orcamento(BigDecimal valor, int quantidadeitens) {
        this.valor = valor;
        this.quantidadeitens = quantidadeitens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeitens() {
        return quantidadeitens;
    }
}
