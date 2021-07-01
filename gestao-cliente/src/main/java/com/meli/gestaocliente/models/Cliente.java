package com.meli.gestaocliente.models;

import java.util.List;

public class Cliente {
    long id;
    String nome;
    String cpf;
    String telefone;
    String email;
    List<Pedido> pedidos;

    public Cliente(String nome, List<Pedido> pedidos) {
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
