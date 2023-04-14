package br.com.dp.desconto;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    /*
        Essa função e responsavel por gerenciar essa
        validação evitando que as suas filha tenha
        reptição de codigo.
    */
    public BigDecimal calcular(Orcamento orcamento){
        if(deveCalcular(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deveCalcular(Orcamento orcamento);

}
