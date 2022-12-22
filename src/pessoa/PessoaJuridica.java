package pessoa;

public class PessoaJuridica extends Pessoa {
    @Override
    public void emitirDoc() {
        System.out.println("Emitindo doc pessoa juridica");
    }
}
