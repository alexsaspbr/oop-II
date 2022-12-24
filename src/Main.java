import br.com.ada.generics.ConsoleWriter;
import br.com.ada.pessoa.NovaPessoaFisica;
import br.com.ada.pessoa.Pessoa;
import br.com.ada.pessoa.PessoaFisica;
import br.com.ada.pessoa.PessoaJuridica;
import br.com.ada.streams.Livro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();
        adicionaLivro(livros, new Livro("A Bíblia Sagrada", 2000));
        adicionaLivro(livros, new Livro("As aventuras de PI", 250));
        adicionaLivro(livros, new Livro("As aventuras de PI", 100));
        adicionaLivro(livros, new Livro("O homem que calculava", 900));

        livros.stream()
                //.skip(1)
                //.limit(2)
                .forEach(l -> {
                    System.out.println(l.getTitulo());
                });

        List<String> listaTitulos = livros.stream()
                .map(Livro::getTitulo)
                .collect(Collectors.toList());


        System.out.println(listaTitulos.stream().count());
        System.out.println(listaTitulos.size());

    }


    public static void adicionaLivro(List<Livro> lista, Livro livro) {
        if (lista.size() == 0){
            lista.add(livro);
        }
        else {
            boolean livroJaIncluso = lista.stream().anyMatch(l -> {
                boolean b = l.getTitulo().equalsIgnoreCase(livro.getTitulo());
                System.out.println(b);
                return b;
            });

            /*
            & - retorna true quando todos são true
            | - retorna true se pelos menos 1 for true
            */

            if(!livroJaIncluso)
                lista.add(livro);
        }
    }


}