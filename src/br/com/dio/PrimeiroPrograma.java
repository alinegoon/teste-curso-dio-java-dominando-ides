package br.com.dio;

import br.com.dio.model.Gato;

import java.sql.SQLOutput;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("seja foda", 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World Girls!" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPagina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;


    }
}