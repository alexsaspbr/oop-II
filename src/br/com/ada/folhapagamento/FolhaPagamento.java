package br.com.ada.folhapagamento;

import java.math.BigDecimal;

public class FolhaPagamento {

    BigDecimal saldo;

    public void pagar(Remuneravel funcionario) {

    /*    if (funcionario instanceof Estagiario) {
            saldo = ((Estagiario)funcionario).getBolsa();
        } else if (funcionario instanceof ContratoPJ) {
            saldo = ((ContratoPJ)funcionario).getValorNF();
        } else if (funcionario instanceof ContratoCLT) {
            saldo = ((ContratoCLT)funcionario).getSalario();
        } else if(funcionario instanceof JovemAprendiz) {
            // bolsa + 500;
        } else if(funcionario instanceof Trainee) {
            // salario - 35%
        } else if (funcionario instanceof Prolabore) {
            // nf - 15%
        }*/

        saldo = funcionario.calcularRemuneracao();

        System.out.printf("Total a pagar R$ %.2f \n", saldo);

    }


}
