package goalsapp.repository;

import org.springframework.data.repository.CrudRepository;

import goalsapp.model.Goal;

public interface GoalRepository extends CrudRepository<Goal, Integer> {

}
