package corso.spring.giorno2.repository;

import org.springframework.data.repository.CrudRepository;

import corso.spring.giorno2.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
