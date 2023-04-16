package br.com.dp.pedido;

import br.com.dp.orcamento.ItemOrcamento;
import br.com.dp.orcamento.Orcamento;
import br.com.dp.pedido.acao.AcaoAposGerarPedido;
import br.com.dp.pedido.acao.EnviarEmailPedido;
import br.com.dp.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }
    public void executar(GeraPedido geraPedido){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(geraPedido.getValorOrcamento()));

        LocalDateTime date = LocalDateTime.now();
        Pedido pedido = new Pedido(geraPedido.getCliente(), date, orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
