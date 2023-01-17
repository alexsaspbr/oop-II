package br.com.ada.folhapagamento;

import java.math.BigDecimal;

public class Estagiario extends Funcionario implements Remuneravel {

    private BigDecimal bolsa;

    public Estagiario(BigDecimal bolsa){
        this.bolsa = bolsa;
    }

    public BigDecimal getBolsa() {
        return bolsa;
    }

    @Override
    public BigDecimal calcularRemuneracao() {
        BigDecimal vt = new BigDecimal(300);
        return this.bolsa.add(vt);
    }
}
