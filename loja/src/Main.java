import br.com.dp.desconto.CalculadoraDeDescontos;
import br.com.dp.imposto.CalculadoraDeImposto;
import br.com.dp.imposto.ISS;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeImposto = new CalculadoraDeDescontos();
        System.out.println("IMPOSTO: " + calculadoraDeImposto.calcular(primeiro));
        System.out.println("IMPOSTO: " + calculadoraDeImposto.calcular(segundo));
    }
}