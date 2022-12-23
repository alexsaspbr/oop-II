import br.com.ada.generics.ConsoleWriter;
import br.com.ada.pessoa.NovaPessoaFisica;
import br.com.ada.pessoa.Pessoa;
import br.com.ada.pessoa.PessoaFisica;
import br.com.ada.pessoa.PessoaJuridica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /* ConsoleWriter<Object, Integer> consoleWriter = new ConsoleWriter(new Object(), 150);
        consoleWriter.write();
        Integer i = consoleWriter.getValue();

        ConsoleWriter<Object, Boolean> consoleWriterB = new ConsoleWriter(new Object(), Boolean.TRUE);
        consoleWriterB.write();
        Boolean b = consoleWriterB.getValue();*/

        ConsoleWriter<Object, PessoaJuridica> consoleWriter2 = new ConsoleWriter<>(new Object(), new PessoaJuridica());
        //consoleWriter2.write();
        PessoaJuridica pj = consoleWriter2.getValue();

        List<Object> listaDesconhecida = Arrays.asList(150, Boolean.TRUE, new PessoaJuridica());
        consoleWriter2.listDesconhecido(listaDesconhecida);

        List<Pessoa> listaExtends = Arrays.asList(new PessoaJuridica(), new NovaPessoaFisica(), new PessoaFisica());
        consoleWriter2.listExtends(listaExtends);

        List<PessoaJuridica> pessoaJuridicas = Arrays.asList(new PessoaJuridica());

        consoleWriter2.listSuper(listaExtends);

    }

}