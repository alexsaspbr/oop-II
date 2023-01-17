package br.com.ada.bolsavalores;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class BolsaValores {
    public BigDecimal calcularPrecoMedioAcoesOrdinarias(List<Acao> acoes) {
        BigDecimal valorTotalOrdinarias = getValorTotalOrdinarias(acoes);
        Long quantidadeOrdinarias = getQuantidadeAcoesOrdinarias(acoes);
        return valorTotalOrdinarias.divide(new BigDecimal(quantidadeOrdinarias));
    }

    private static Stream<Acao> getAcoesOrdinariasStream(List<Acao> acoes) {
        return acoes.stream()
                .filter(BolsaValores::isAcaoAtiva);
    }
    private BigDecimal getValorTotalOrdinarias(List<Acao> acoes) {
        return getAcoesOrdinariasStream(acoes) //filtrando acoes ordinarias
                .map(Acao::getValor) //transformando em um stream de valores das acoes ordinarias
                .reduce(BigDecimal.ZERO, BigDecimal::add); //somando todos os valores das acoes ordinarias
    }


    private Long getQuantidadeAcoesOrdinarias(List<Acao> acoes) {
        return getAcoesOrdinariasStream(acoes)
                .count();
    }

    private static Boolean isAcaoAtiva(Acao acao){
        return acao.isOrdinaria();
    }

}

class Acao {
    private String nome;
    private BigDecimal valor;
    private Boolean ordinaria;

    public Boolean isOrdinaria() {
        return ordinaria;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
