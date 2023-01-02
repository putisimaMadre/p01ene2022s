package com.formatoweb.p01ene2022s.repository;

import com.formatoweb.p01ene2022s.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Serializable> {
}
