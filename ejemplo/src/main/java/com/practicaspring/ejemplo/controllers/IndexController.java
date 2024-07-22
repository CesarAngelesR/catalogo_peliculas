package com.practicaspring.ejemplo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@GetMapping(value="/")
	public String index(Model model) {
		model.addAttribute("titulo", "Es el titulo");
		model.addAttribute("saludo", "Es el saludo");
		model.addAttribute("show",false);
		//List<String> series = List.of("Dexter", "Hause of cards", "House");
		//model.addAttribute("series",series);
		return "index";
	}
	
	@GetMapping(value="/index.mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("titulo", "Es el titulo");
		mv.addObject("saludo", "Es el saludo");
		mv.addObject("show",false);
		//List<String> series = List.of("Dexter", "Hause of cards", "House");
		//mv.addObject("series",series);
		
		return mv;
	}
	
	@ModelAttribute("series")
	public List<String> getSeries(){
		return List.of("Dexter", "Hause of cards", "House", "Vikings","Kingdom");
	}
	
	@PostMapping(value="/index-post")
	public String indexRequestMapping() {
		return "index";
	}
	
}
