package br.com.fiap.spring.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.spring.model.Bebida;

@Controller
@RequestMapping("inicio")
public class BebidaController {
	
	// Aplicar o componente na classe implDAO
	@Autowired
	private BebidaDAO dao;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}

	
	// Realizar o transactional para realizar o commit
	@Transactional
	@PostMapping("cadastrar")
	// Flash Mantem a informação depois do redirect
	// RedirectAttributs permite o redirecionamento da msg
	
	public ModelAndView processarForm(Bebida b , RedirectAttributes r) {
		dao.create(b);
		
		// Adiciona uma mensagem no objeto que guarda informação apos o redirect
		r.addFlashAttribute("msg" , "Bebida Cadastrada");
		// Redirect manda uma nova requisição , Redirecionando para uma URL
		return new ModelAndView("redirect:/inicio/index");
	
	}
	
	// Listando
	@GetMapping("listar")
	public ModelAndView Listar(Bebida b) {
		return new ModelAndView("Sucesso").addObject("msgLista" , dao.list());
	}
	
	@GetMapping("editar/{id}")
	// Obtendo o codigo da url
	public ModelAndView abrirEdicao(@PathVariable("id") int codigo) {
		return new ModelAndView("Editar").addObject("bebida", dao.read(codigo));
	}
	
	
}
