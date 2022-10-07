package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.model.HomeModel;

@Controller
@RequestMapping("/home")
public class MainMenuController {
	
	@GetMapping("/")
	public String display(Model model) 
	{
		model.addAttribute("title", "Home Page");
//		model.addAttribute("home",new HomeModel());
		model.addAttribute("message", new String("AHHHHHHHHHHHHH"));
		return "home";
	}
	
	@GetMapping("/intro")
	public ModelAndView printHello1() 
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", new String("Welcome to GAS"));
		mv.addObject("message2", new String("AKA just another Generic Anime Store"));
		mv.setViewName("home");
		return mv;
	}
}
