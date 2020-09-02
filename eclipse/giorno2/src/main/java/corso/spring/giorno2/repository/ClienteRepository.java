package corso.spring.giorno2.repository;

import org.springframework.data.repository.CrudRepository;

import corso.spring.giorno2.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
