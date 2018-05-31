package goalsapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import goalsapp.model.Goal;
import goalsapp.service.GoalService;

@Controller
public class GoalController {

	@Autowired
	private GoalService goalService;
	
	@PostMapping("/save-goal")
	public String saveGoal(@ModelAttribute @Valid Goal goal, BindingResult bindingResult, HttpServletRequest request) {		
		try {
			this.goalService.saveOrUpdate(goal);
			request.setAttribute("message", "Succesfully saved!");
		}catch(Exception e) {
			if(e instanceof ConstraintViolationException) {
				ConstraintViolation cv = ((ConstraintViolationException)e).getConstraintViolations().iterator().next();
				request.setAttribute("message", "Field["+ cv.getPropertyPath() +"], Error["+ cv.getMessage() +"]");
			}else {
				request.setAttribute("message", "Error while saving details");
			}
			
			
		}		
		return "manage-goal";
	}
	
	@GetMapping("/edit-goal")
	public String editGoal(@RequestParam int id, HttpServletRequest request) {
		Goal goal = this.goalService.findById(id);
		request.setAttribute("goal", goal);
		return "manage-goal";
	}
	
	@GetMapping("/delete-goal")
	public String deleteGoal(@RequestParam int id, HttpServletRequest request) {
		this.goalService.delete(id);
		return "redirect:list-goals";
	}
}
