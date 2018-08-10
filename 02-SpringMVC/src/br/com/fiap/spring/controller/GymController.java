package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Aluno;

@Controller
@RequestMapping("academia")
public class GymController {

	@GetMapping("cadastrar")
	public String index() {
		return "academia/index";
	}
	
	// Enviar a requisição para o controller passada a acao do html
	@PostMapping("cadastrar")
	
	public ModelAndView ProcessarHTML(Aluno a) {
		// Recuperar os dados do HTML , igual ao name dos inputs
		
		ModelAndView r = new ModelAndView("academia/sucesso");
		r.addObject("msg" ,"registrado com sucesso");
		r.addObject("a",a);
		return r;
		
	}


}
