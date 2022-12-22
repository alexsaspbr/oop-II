import br.com.ada.copa.Selecao;
import pessoa.NovaPessoaFisica;
import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Selecao brasil = new Selecao("Brasil", 0, 0, 1);
        Selecao argentina = new Selecao("Argentina", 0, 0, 5);
        Selecao franca = new Selecao("Franca", 0, 0, 4);
        Selecao espanha = new Selecao("Espanha", 0, 0, 3);

        List<Selecao> ranking = new ArrayList<>();

        ranking.add(brasil);
        ranking.add(argentina);
        ranking.add(franca);
        ranking.add(espanha);

        System.out.println("Lista sem ordenação");
        ranking.stream().forEach(selecao -> {
            System.out.println(selecao.getNome());
        });

        Comparator<Selecao> comparador = Comparator
                .comparing(Selecao::getPontuacao)
                .thenComparing(Selecao::getSaldoGol)
                .reversed()
                .thenComparing(Selecao::getCartoesAmarelos)
                ;
        ;

        Collections.sort(ranking, comparador);
        //Collections.sort(ranking);
        System.out.println("\nLista com ordenação");
        ranking.forEach(selecao -> System.out.println(selecao.getNome()));
*/

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        NovaPessoaFisica np = new NovaPessoaFisica();

        emitirDocumentoDe(pessoaFisica);
        emitirDocumentoDe(pessoaJuridica);
        emitirDocumentoDe(np);


    }

    public static void emitirDocumentoDe(Pessoa pessoa) {
        pessoa.first();
        pessoa.second();
    }

}