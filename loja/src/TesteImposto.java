import br.com.dp.imposto.CalculadoraDeImposto;
import br.com.dp.imposto.ICMS;
import br.com.dp.imposto.ISS;
import br.com.dp.orcamento.ItemOrcamento;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
