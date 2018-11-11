package br.com.fiap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.spring.dao.GeneroDAO;
import br.com.fiap.spring.model.Genero;

@Controller
@RequestMapping("ps")
public class GeneroController {
	
	
	//Chamar a classe InterfaceDAO
	
	@Autowired(required = true)
	private GeneroDAO generoDAO;
	
	// ========================================================================================
	
	// Relizando o Cadastro
	
	@GetMapping("cadastrar")
	public String abrirPaginaCadastro(Genero g) {
		return "genero/cadastrar";
	}
	
	
	//Realizando a acao do cadastro
	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView CadastrarGenero(Genero g , RedirectAttributes r) {
		//Chamos nossa interface para acessar um de nossos crud para realizar o cadastro
		generoDAO.cadastrar(g);
		// Obtendo um metodo que redirecionará um acao de mensagem apos realizar o cadastro
		r.addFlashAttribute("msg", "Genero Cadastrado");
		//Realizando um retonor do topo modelAndView e redirecionados novamente para a pagina cadastro para evitar que o usarios cadastre novamente
		return new ModelAndView("redirect:/ps/cadastrar");
	}

	
	
}
