package com.sudtechnologies.spring.jpa.models.dao;

import com.sudtechnologies.spring.jpa.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}