package goalsapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import goalsapp.model.Goal;
import goalsapp.service.GoalService;

@Controller
public class MainController {
	
	@Autowired
	private GoalService goalService;

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/manage-goal")
	public String manageGoals() {
		return "manage-goal";
	}
	
	@GetMapping("/list-goals")
	public String listGoals(HttpServletRequest request) {
		List<Goal> myGoals = this.goalService.findAll();
		request.setAttribute("myGoals", myGoals);
		return "list-goals";
	}
}
