package br.com.ada.generics;

import br.com.ada.pessoa.NovaPessoaFisica;
import br.com.ada.pessoa.Pessoa;
import br.com.ada.pessoa.PessoaFisica;
import br.com.ada.pessoa.PessoaJuridica;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsoleWriter<T, V> {

    /*

      T - Type
      E - Type elements
      K - Type Key
      V - Type Value
      N - Type Number

     */


    private T type;
    private V value;

    public ConsoleWriter(T type, V value){
        this.type = type;
        this.value = value;
    }

    public void write() {
        System.out.println(this.value);


        Map<String, Object> mapa = new HashMap<>();
        mapa.put("nome", "Alex");

        mapa.get("nome");

    }

    public <T> T getType(){
        return (T) this.type;
    }

    public <V> V getValue(){
        return (V) this.value;
    }

    //UNKNOWON
    public void listDesconhecido(List<?> list){
        list.forEach(System.out::println);
    }

    //EXTENDS
    public void listExtends(List<? extends Pessoa> list){
        list.forEach(System.out::println);
    }

    public void addItem(List<? super Pessoa> list){
        list.add(new PessoaJuridica());
    }

    //SUPER
    public void listSuper(List<? super NovaPessoaFisica> list){
        list.forEach(System.out::println);
    }

}
