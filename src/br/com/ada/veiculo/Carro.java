package br.com.ada.veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    private String parametroCarro;

    public Carro() {
        super();
    }

    @Override
    public BigDecimal getValorDiaria() {
        return new BigDecimal(150.0);
    }
}
