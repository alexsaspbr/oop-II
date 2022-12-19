package br.com.ada.copa;

import java.util.Comparator;

public class Selecao implements Comparable<Selecao> {

    private String nome;
    private Integer saldoGol;
    private Integer pontuacao;

    public Selecao(String nome, Integer saldoGol, Integer pontuacao) {
        this.nome = nome;
        this.saldoGol = saldoGol;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public Integer getSaldoGol() {
        return saldoGol;
    }

    @Override
    public int compareTo(Selecao outraSelecao) {
        int p = outraSelecao.getPontuacao().compareTo(this.pontuacao);

        //-1 = menor
        // 0 = iguais
        // 1+ = maior
        int sg = outraSelecao.getSaldoGol().compareTo(this.saldoGol);

        if(p == 0)
            return sg;
        else
            return p;
    }
}
