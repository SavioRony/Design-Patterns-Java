import br.com.dp.imposto.CalculadoraDeImposto;
import br.com.dp.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        System.out.println("IMPOSTO: " + calculadoraDeImposto.calcular(orcamento, TipoImposto.ISS));
    }
}