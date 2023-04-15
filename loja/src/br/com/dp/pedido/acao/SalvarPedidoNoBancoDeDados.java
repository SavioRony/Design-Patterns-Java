package br.com.dp.pedido.acao;

import br.com.dp.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }
}
