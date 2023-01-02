package com.formatoweb.p01ene2022s.controller;

import com.formatoweb.p01ene2022s.entity.Clientes;
import com.formatoweb.p01ene2022s.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClietesController {
    @Autowired
    private ClientesService clientesService;
    @GetMapping("/clientes")
    public List<Clientes> getClientes(){
        return clientesService.getClientes();
    }

    @PostMapping("/clientes")
    public Clientes saveClientes(@RequestBody Clientes clientes){
        return clientesService.saveClientes(clientes);
    }

    @GetMapping("/clientes/{id}")
    public Clientes getClientebyId(@PathVariable Long id){
        return clientesService.getClienteById(id);
    }
}
