import br.com.ada.copa.Selecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Selecao brasil = new Selecao("Brasil", 10, 9);
        Selecao argentina = new Selecao("Argentina", 11, 9);
        Selecao franca = new Selecao("Franca", 9, 9);

        List<Selecao> ranking = new ArrayList<>();

        ranking.add(brasil);
        ranking.add(argentina);
        ranking.add(franca);

        System.out.println("Lista sem ordenação");
        ranking.stream().forEach(selecao -> {
            System.out.println(selecao.getNome());
        });

        Comparator<Selecao> comparatorSaldoGol = Comparator.comparing(Selecao::getSaldoGol).reversed();

        Collections.sort(ranking, comparatorSaldoGol);
        System.out.println("\nLista com ordenação");

        ranking.forEach(selecao -> System.out.println(selecao.getNome()));

    }
}