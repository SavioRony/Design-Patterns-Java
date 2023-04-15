import br.com.dp.orcamento.Orcamento;
import br.com.dp.pedido.GeraPedido;
import br.com.dp.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedido {
    public static void main(String[] args) {
        String nomeCliente = "Ana Jose";

        GeraPedido geraPedido = new GeraPedido(nomeCliente, new BigDecimal("100"),2);
        geraPedido.executar();

    }
}
