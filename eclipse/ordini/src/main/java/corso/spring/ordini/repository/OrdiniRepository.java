package corso.spring.ordini.repository;

import org.springframework.data.repository.CrudRepository;

import corso.spring.ordini.model.Ordine;

public interface OrdiniRepository extends CrudRepository<Ordine, Integer> {

}
