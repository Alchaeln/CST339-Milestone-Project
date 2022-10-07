package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.RegisterModel;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@GetMapping("/")
	public String display(Model model) 
	{
		model.addAttribute("title", "Register Form");
		model.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	
	@PostMapping("/doRegister")
	public String doRegister(@Valid RegisterModel registerModel, BindingResult bindingResult, Model model) 
	{
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Register Form");
			return "register";
		}
		
		LoginModel login = new LoginModel();
		
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", login);
		
		//shows info taken into
		System.out.println(String.format("New User created with %s user name, %s password, %s %s name, %s phone number, %s email",
				registerModel.getUsername(), 
				registerModel.getPassword(), 
				registerModel.getFirstname(), 
				registerModel.getLastname(), 
				registerModel.getPhonenumber(), 
				registerModel.getEmail()));
	
		return "login";
		

	}
	
}
