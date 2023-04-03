package ua.kaziamyr.WebApp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.kaziamyr.WebApp1.models.User;

@Controller
@RequestMapping
public class MainController {
	@GetMapping()
	public String open(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "index";
	}
	@PostMapping("/check-user")
	public String give(@ModelAttribute("user") User user) {		
		return "show";
	}
}
