package es.davidrico.springboot.models.dao;

import es.davidrico.springboot.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

	
}
