package goalsapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import goalsapp.model.Goal;
import goalsapp.repository.GoalRepository;

@Service
@Transactional
public class GoalService {

	private GoalRepository goalRepository;
	
	public GoalService(GoalRepository goalRepository) {
		this.goalRepository = goalRepository;		
	}
	
	public Goal findById(int id) {
		return this.goalRepository.findOne(id);		
	}
	
	public List<Goal> findAll(){
		return (List<Goal>) this.goalRepository.findAll();
	}
	
	public Goal saveOrUpdate(Goal goal) {
		return this.goalRepository.save(goal);
	}
	
	public void delete(int id) {
		Goal goal = this.findById(id);
		this.goalRepository.delete(goal);
	}
}
