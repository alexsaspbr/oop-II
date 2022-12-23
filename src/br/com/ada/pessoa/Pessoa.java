package br.com.ada.pessoa;

public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void first(){
        emitirDoc();
    }

    public void second(){
        System.out.println("Imprimir documento...");
    }

    public void emitirDoc(){
        System.out.println("Classe pessoa");
    };

}
