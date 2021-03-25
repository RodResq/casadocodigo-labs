package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.models.Livro;

import javax.inject.Named;

@Named
public class AdminLivrosBean {

    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public void salvar() {
        System.out.println("Livro salvo com Sucesso!");


    }
}
