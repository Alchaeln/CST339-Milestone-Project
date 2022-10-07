package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainMenuController {
	
	@GetMapping("/")
	public ModelAndView printHello1() 
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", new String("Welcome to GAS"));
		mv.addObject("message2", new String("AKA just another Generic Anime Store"));
		mv.setViewName("home");
		return mv;
	}
}
