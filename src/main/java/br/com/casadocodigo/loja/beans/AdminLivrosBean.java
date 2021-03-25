package br.com.casadocodigo.loja.beans;

import br.com.casadocodigo.loja.models.Livro;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AdminLivrosBean {

    private Livro livro = new Livro();

    public Livro getLivro() {
        return livro;
    }

    public void salvar() {
        System.out.println("Livro cadastrado " + this.livro.toString());


    }
}
