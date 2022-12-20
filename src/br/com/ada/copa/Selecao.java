package br.com.ada.copa;

public class Selecao implements Comparable<Selecao> {

    private String nome;
    private Integer saldoGol;
    private Integer pontuacao;
    private Integer cartoesAmarelos;

    public Selecao(String nome, Integer saldoGol, Integer pontuacao, Integer cartoesAmarelos) {
        this.nome = nome;
        this.saldoGol = saldoGol;
        this.pontuacao = pontuacao;
        this.cartoesAmarelos = cartoesAmarelos;
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

    public Integer getCartoesAmarelos() {
        return cartoesAmarelos;
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
