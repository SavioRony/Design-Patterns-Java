package br.com.dp.pedido;

import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidade;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidade = quantidade;
    }

    public void executar(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidade);
        LocalDateTime date = LocalDateTime.now();
        Pedido pedido = new Pedido(cliente,date,orcamento);
        System.out.println("Salvar Pedido no banco de dados!");
        System.out.println("Enviar email com dados do novo pedido!");
    }
}
