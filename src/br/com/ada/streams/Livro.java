package br.com.ada.streams;

import java.util.Objects;

public class Livro {

    private String titulo;
    private Integer quantidadePaginas;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, Integer quantidadePaginas) {
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(quantidadePaginas, livro.quantidadePaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, quantidadePaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(Integer quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }
}
