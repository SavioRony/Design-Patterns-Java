package br.com.dp.pedido.acao;

import br.com.dp.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido");
    }
}
