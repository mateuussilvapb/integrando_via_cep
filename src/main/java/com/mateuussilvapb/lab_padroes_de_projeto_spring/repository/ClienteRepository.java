package com.mateuussilvapb.lab_padroes_de_projeto_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mateuussilvapb.lab_padroes_de_projeto_spring.model.Cliente;

//======================================= //
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
