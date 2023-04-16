import br.com.dp.desconto.CalculadoraDeDescontos;
import br.com.dp.orcamento.ItemOrcamento;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadoraDeImposto = new CalculadoraDeDescontos();
        System.out.println("IMPOSTO: " + calculadoraDeImposto.calcular(primeiro));
        System.out.println("IMPOSTO: " + calculadoraDeImposto.calcular(segundo));
    }
}