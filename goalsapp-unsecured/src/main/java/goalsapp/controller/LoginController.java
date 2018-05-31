package goalsapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import goalsapp.model.User;
import goalsapp.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/login-page")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/login-submit")
	public String loginSubmit(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		boolean authenticated = userService.authenticateUser(user.getUsername(), user.getPassword());
		if(authenticated) {
			request.setAttribute("message", "Login successful");
		}else {
			request.setAttribute("message", "Login failed!");
		}
		return "login";
	}
}
