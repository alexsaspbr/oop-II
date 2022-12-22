package br.com.ada.veiculo;

public abstract class Veiculo {

    protected String fabricante;

    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void desacelerar();

}
