package br.com.ada.pessoa;

public class PessoaJuridica extends Pessoa {
    @Override
    public void emitirDoc() {
        System.out.println("Emitindo doc pessoa juridica");
    }
}
