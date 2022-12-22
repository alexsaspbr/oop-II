package br.com.ada.veiculo;

public abstract class VeiculoAereo extends Veiculo {

    private String turbina;

    abstract void voar();

    abstract void decolar();

    abstract void pousar();

}
