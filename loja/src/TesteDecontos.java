import br.com.dp.desconto.CalculadoraDeDescontos;
import br.com.dp.orcamento.ItemOrcamento;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDecontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
        System.out.println(calculadora.calcular(orcamento3));
    }
}
