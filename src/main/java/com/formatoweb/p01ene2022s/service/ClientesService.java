package com.formatoweb.p01ene2022s.service;

import com.formatoweb.p01ene2022s.entity.Clientes;

import java.util.List;

public interface ClientesService {
    List<Clientes> getClientes();
    Clientes saveClientes(Clientes clientes);

    Clientes getClienteById(Long id);
}
