package br.com.dp.pedido;

import br.com.dp.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public GeraPedidoHandler(/*Dependecias: Repository, Service*/) {
    }

    public void executar(GeraPedido geraPedido){
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidade());
        LocalDateTime date = LocalDateTime.now();
        Pedido pedido = new Pedido(geraPedido.getCliente(), date, orcamento);
        System.out.println("Salvar Pedido no banco de dados!");
        System.out.println("Enviar email com dados do novo pedido!");
    }
}
