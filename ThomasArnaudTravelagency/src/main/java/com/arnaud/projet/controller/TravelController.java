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

import com.arnaud.projet.dao.TravelDaoJpa;
import com.arnaud.projet.model.Agency;
import com.arnaud.projet.model.Travel;



@Controller
@RequestMapping("/travel")
public class TravelController {

	@Autowired
	private TravelDaoJpa tdao;
	
	
	@GetMapping("/{id}") 
	public String findOne(@PathVariable Long id, Model model) {
		Optional<Travel> travel = this.tdao.findById(id);
		
		if(travel.isPresent()) {
			model.addAttribute("travel", travel.get());
			return "travel/details";
		}
		return "redirect:/agencies/details";
	}

	@GetMapping("/agencies/{agenceId}/add-travel/{destination}/{duration}/{price}")
	public String addTravel(@PathVariable Long id,
			@PathVariable String destination,
			@PathVariable int duration,
			@PathVariable int price,
			Model model) {
		Optional<Travel> travelRes = this.tdao.findById(id);
		if(travelRes.isPresent()) {
			tdao.save(new Travel());
			return "/travel/details";
		}
		return "/travel";	
	}
	
}