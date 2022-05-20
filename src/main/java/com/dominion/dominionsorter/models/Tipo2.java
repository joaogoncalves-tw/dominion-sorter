package com.dominion.dominionsorter.models;

public enum Tipo2 {
    ACAO("Ação"),
    ATAQUE("Ataque"),
    TESOURO("Tesouro"),
    MALDICAO("Maldição"),
    VITORIA("Vitória");

    String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Tipo returnByDescricao(String descricao){
        for(Tipo tipo: values()){
            if (tipo.getDescricao().equals(descricao)) return tipo;
        }

        return null;
    }
}
