//package com.crm.controller;
//
//import java.util.UUID;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.crm.entity.Group;
//import com.crm.entity.Role;
//import com.crm.repository.GroupRepository;
//@Controller
//@RequestMapping("group")
//public class GroupController {
//	@Autowired
//	GroupRepository groupRepository;
//	@GetMapping("")
//	public String index(Model model) {
//		model.addAttribute("groups",groupRepository.findAll());
//		return "group/index";
//	}
//	@GetMapping("/add")
//	public String add(Model model) 
//	{	
//		model.addAttribute("group", new Group());
//		return "group/add";
//	}
//	@PostMapping("/add")
//	public String add(@Valid @ModelAttribute Group group, BindingResult erros ) {
//		group.setId(UUID.randomUUID().toString());
//		groupRepository.save(group);
//		return "redirect:/group";
//	}
//	@GetMapping("/edit/{id}")
//	public String edit(Model model, @PathVariable String id) {	
//		model.addAttribute("group", groupRepository.findById(id));
//		return "group/edit";
//	}
//	
//	@PostMapping("edit")
//	public String edit(@Valid @ModelAttribute Group group, BindingResult erros) {	
//		groupRepository.save(group);
//		return "redirect:/group";
//	}
//	
//	@GetMapping("delete/{id}")
//	public String delete(@Valid @ModelAttribute Role role, BindingResult erros, @PathVariable String id) {	
//		groupRepository.deleteById(id);
//		return "redirect:/role";
//	}
//		
//	
//	
//	
//}
