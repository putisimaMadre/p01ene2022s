package com.formatoweb.p01ene2022s.service.impl;

import com.formatoweb.p01ene2022s.entity.Clientes;
import com.formatoweb.p01ene2022s.repository.ClienteRepository;
import com.formatoweb.p01ene2022s.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServiceImpl implements ClientesService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Clientes> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Clientes saveClientes(Clientes clientes) {
        return clienteRepository.save(clientes);
    }

    @Override
    public Clientes getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
