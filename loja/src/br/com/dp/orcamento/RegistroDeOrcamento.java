package br.com.dp.orcamento;

import br.com.dp.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        String url = "http://api.externa/orc";
        Map<String, Object> dados = Map.of(
                "Valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeitens()
        );
        http.post(url, dados);
    }
}
