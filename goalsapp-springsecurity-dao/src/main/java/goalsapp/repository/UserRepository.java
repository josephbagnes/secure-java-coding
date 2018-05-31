package goalsapp.repository;

import org.springframework.data.repository.CrudRepository;

import goalsapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUsername(String username);
}
