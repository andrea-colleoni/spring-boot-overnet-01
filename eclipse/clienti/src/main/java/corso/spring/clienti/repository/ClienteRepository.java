package corso.spring.clienti.repository;

import org.springframework.data.repository.CrudRepository;

import corso.spring.clienti.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
