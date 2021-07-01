package com.meli.gestaocliente.models;

import java.util.List;

public class Pedido {
    long id;
    List<Produto> produtos;

    public Pedido(long id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pedido() {

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
