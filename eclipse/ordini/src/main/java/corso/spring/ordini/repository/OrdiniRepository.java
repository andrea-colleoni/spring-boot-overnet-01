package corso.spring.ordini.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import corso.spring.ordini.model.Ordine;

@RepositoryRestResource(collectionResourceRel = "ordini", path = "ordini")
public interface OrdiniRepository extends PagingAndSortingRepository<Ordine, Integer> {

}
