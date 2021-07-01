package com.meli.gestaocliente.controllers;

import com.meli.gestaocliente.models.Pedido;
import com.meli.gestaocliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/loja")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "/clientes/{id}/pedidos")
    @ResponseBody
    public ResponseEntity<List<Pedido>> getPedidos(@PathVariable long id) {
        return new ResponseEntity<>(clienteService.consultaPedidos(id), HttpStatus.OK);
    }

}
