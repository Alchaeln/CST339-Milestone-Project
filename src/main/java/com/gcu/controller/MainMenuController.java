package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//Sets up URI for localhost:8080/
@RequestMapping("/")
public class MainMenuController {
	
	//Sets up URI for localhost:8080/ which is the root URI
	@GetMapping("/")
	public ModelAndView display() 
	{
		//creates model and view object
		ModelAndView mv = new ModelAndView();
		//adds text to be displayed
		mv.addObject("message", new String("Welcome to GAS"));
		mv.addObject("message2", new String("AKA just another Generic Anime Store"));
		//sets view name to display home.html
		mv.setViewName("home");
		return mv;
	}
}
