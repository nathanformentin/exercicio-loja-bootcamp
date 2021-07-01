package com.meli.gestaocliente.daos;

import com.meli.gestaocliente.models.Cliente;
import com.meli.gestaocliente.models.Pedido;
import com.meli.gestaocliente.models.Produto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClienteDAO {

    private static final Map<Long, Cliente> clientes = new HashMap<>();
    private static Long id = 0L;

    public Cliente getClienteById(Long id) {
        return clientes.get(id);
    }

    public ClienteDAO() {
        this.geraClientes();
    }

    public Cliente persisteCliente(Cliente cliente) {
        cliente.setId(id++);
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    public void geraClientes() {
        List<Produto> produtos = Arrays.asList(
                new Produto(1,20),
                new Produto(2, 30),
                new Produto(3, 40)
        );

        List<Produto> produtos2 = Arrays.asList(
                new Produto(4,80),
                new Produto(9, 10),
                new Produto(15, 90)
        );

        Pedido pedido = new Pedido(1,produtos);
        Pedido pedido2 = new Pedido(2, produtos2);

        List<Pedido> listaPedidos = Arrays.asList(
                pedido, pedido2
        );

        Cliente cliente = new Cliente("victor", listaPedidos);
        Cliente cliente2 = new Cliente("jhonas", listaPedidos);

        persisteCliente(cliente);
        persisteCliente(cliente2);
    }

}
