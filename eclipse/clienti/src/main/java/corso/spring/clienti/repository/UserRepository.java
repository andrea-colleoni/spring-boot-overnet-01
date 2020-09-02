package corso.spring.clienti.repository;

import org.springframework.data.repository.CrudRepository;

import corso.spring.clienti.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
