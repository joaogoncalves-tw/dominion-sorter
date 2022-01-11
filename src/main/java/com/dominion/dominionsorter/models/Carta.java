package com.dominion.dominionsorter.models;


public class Carta {
    private String nome;
    private String descricao;
    private Tipo tipo;
    private String imagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Carta(String nome, String descricao, Tipo tipo, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.imagem = imagem;
    }

    public Carta() {
    }
}
