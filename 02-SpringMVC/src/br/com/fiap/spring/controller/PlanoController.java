package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Plano;

@Controller
@RequestMapping("plano")

public class PlanoController {

	@GetMapping("cadastrar")
	public String index() {
		return "academia/plano/index";
	}
	
	
	@PostMapping("cadastrar")
	public ModelAndView ProcessarPagina(Plano p) {
		ModelAndView mv = new ModelAndView("academia/plano/index");
		mv.addObject("msg" , "Informações do plano escolhido");
		mv.addObject("key" , p);
		
		return mv;
	}
	
}
