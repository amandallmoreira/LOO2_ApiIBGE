package com.example.api_ibge;
public class Estado {
    private int id;
    private String nome;
    private String sigla;

    private  int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public String getSigla(){
        return sigla;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString(){
        return nome; //Usado para exibir o nome no AutoCompleteTextView
    }

}
