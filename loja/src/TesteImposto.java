import br.com.dp.imposto.CalculadoraDeImposto;
import br.com.dp.imposto.ICMS;
import br.com.dp.imposto.ISS;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
