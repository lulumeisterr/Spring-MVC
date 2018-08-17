package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Festa;

@Controller
@RequestMapping("festa")
public class HomeController {

	@GetMapping("form")
	public String index() {
		return "Festa";
	}
	
	@PostMapping("cadastrar")
	public ModelAndView cadastrar(Festa f) {
		
		ModelAndView mv = new ModelAndView("cadastrar");
		mv.addObject("msg" , "Informações da festa");
		mv.addObject("key" , f);
		
		return mv;
		
	}
	
	
	
}
