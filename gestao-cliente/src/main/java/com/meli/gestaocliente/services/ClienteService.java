package com.meli.gestaocliente.services;

import com.meli.gestaocliente.daos.ClienteDAO;
import com.meli.gestaocliente.models.Cliente;
import com.meli.gestaocliente.models.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    public List<Pedido> consultaPedidos(long id) {
        Cliente cliente = clienteDAO.getClienteById(id);
        if (Objects.isNull(cliente)) {
            return null;
        }

        return cliente.getPedidos();
    }

}
