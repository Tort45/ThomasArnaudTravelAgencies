package com.arnaud.projet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arnaud.projet.dao.AgencyDaoJpa;
import com.arnaud.projet.dao.TravelDaoJpa;
import com.arnaud.projet.model.Agency;
import com.arnaud.projet.model.Travel;

@Controller
@RequestMapping("/agencies")
public class AgencyController {

	@Autowired
	private AgencyDaoJpa adao;
	
	@Autowired
	private TravelDaoJpa tdao;
	
		
	@GetMapping("/list") 
	public String findAll(@RequestParam(required = false, defaultValue = "0") Integer init, Model model) {
		
		List<Agency> agencies = adao.findAll();
		model.addAttribute("agencies", agencies);
		return "agencies/list";
	}
	
	@GetMapping("/{id}") 
	public String FindById(@RequestParam(required = false, defaultValue = "0") Integer init, Model model) {
		
		List<Travel> travels = tdao.findAll();
		model.addAttribute("travels", travels);
		return "agencies/details";
	}
	
	@GetMapping("/agencies/{agenceId}/add-travel/{destination}/{duration}/{price}") 
	public String addAgency(@PathVariable Long id,
			@PathVariable String name,
			Model model) {
			adao.save(new Agency());
			return "/agencies/list";		
	}
			
}