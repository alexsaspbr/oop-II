package br.com.ada.folhapagamento;

import java.math.BigDecimal;

public class ContratoPJ extends Funcionario implements Remuneravel {

    private BigDecimal valorNF;

    public ContratoPJ(BigDecimal valorNF){
        this.valorNF = valorNF;
    }

    public BigDecimal getValorNF() {
        return valorNF;
    }

    @Override
    public BigDecimal calcularRemuneracao() {
        BigDecimal impostos = this.valorNF.multiply(new BigDecimal(0.10));
        return this.valorNF.subtract(impostos);
    }
}
