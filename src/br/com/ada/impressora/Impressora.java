package br.com.ada.impressora;

import br.com.ada.veiculo.Veiculo;

public class Impressora<T extends Veiculo> {

    private T t;

    public Impressora(T t) {
        this.t = t;
    }

    public void imprimir() {
       // System.out.printf("Fabricante %s", this.t.getFabricante());
    }

    public String imprimirPDF() {
        // System.out.printf("Fabricante %s", this.t.getFabricante());
    }

    public T getT() {
        return t;
    }

}
