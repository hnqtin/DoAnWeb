package com.crm.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entity.User;
import com.crm.repository.RoleRepository;
import com.crm.repository.UserRepository;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("")
	public String index(Model model) {	
		model.addAttribute("users",userRepository.findAllUserRole());	 
		return "user/index";
	}
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("roles", roleRepository.findAll()); 
		return "user/add";
	}
	@PostMapping("/add")
	public String add(@Valid @ModelAttribute User user, BindingResult erros) {
		
		// Tạo id cho role
		user.setId(UUID.randomUUID().toString());
	
		userRepository.save(user);
		return "redirect:/user";
	}
	@GetMapping("/details/{id}")
	public String details() {
	 
		return "user/details";
	}
}
