package br.com.fiap.biblioteca.view;


import br.com.fiap.biblioteca.model.Livro;// se não importar o pacote livro aqui no pacote princiap não vamos conseguir pegar as informações da classe livro

public class Principal {

    public static void main(String[] args) {
        // Instanciar um livro
        Livro livro = new Livro();
        // Atribuir um título ao livro
        livro.setTitulo("Java como programar");//tive que colocar publico lá na classe livro no atributo livro para conseguir usar ele


    }
}
