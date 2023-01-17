package br.com.ada.folhapagamento;

import java.math.BigDecimal;

public class ContratoCLT extends Funcionario implements Remuneravel {

    private BigDecimal salario;


    public ContratoCLT(BigDecimal salario){
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }


    @Override
    public BigDecimal calcularRemuneracao() {
        BigDecimal descontos = this.salario.multiply(new BigDecimal(0.50)) ;
        return this.salario.subtract(descontos);
    }
}
