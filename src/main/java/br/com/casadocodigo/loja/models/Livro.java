package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class Livro {

    private String titulo;
    private String descricao;
    private BigDecimal preco;
    private Integer numeroPaginas;

    // getters e setters aqui!

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco + ", numeroPaginas="
                + numeroPaginas + "]";
    }


}
