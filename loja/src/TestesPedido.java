import br.com.dp.orcamento.Orcamento;
import br.com.dp.pedido.GeraPedido;
import br.com.dp.pedido.GeraPedidoHandler;
import br.com.dp.pedido.Pedido;
import br.com.dp.pedido.acao.EnviarEmailPedido;
import br.com.dp.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedido {
    public static void main(String[] args) {
        String nomeCliente = "Ana Jose";
        GeraPedido geraPedido = new GeraPedido(nomeCliente, new BigDecimal("100"),2);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(
                new EnviarEmailPedido(),
                new SalvarPedidoNoBancoDeDados()));
        geraPedidoHandler.executar(geraPedido);
    }
}
