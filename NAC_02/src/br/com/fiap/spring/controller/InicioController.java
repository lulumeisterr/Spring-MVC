package br.com.fiap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.bean.Aluno;
import br.com.fiap.spring.dao.AlunoDAO;
import br.com.fiap.spring.exception.KeyNotFoundException;


@Controller
@RequestMapping("Inicial")
public class InicioController {

	//Chamar a classe InterfaceDAO
	
	@Autowired(required=true)
	private AlunoDAO AlunoDAO;
	
	//Carregando a Index
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	//===============Cadastrando==========================================================================
	
	//Carregando a tela de cadastro
	@GetMapping("cadastrar")
	public String OpenCadasto(Aluno a) {
		return "Aluno/cadastro";
	}
	
	//Acao para inputar o dado na aplicação
	//RedirectAttribute para enviar a msg
	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView inputDadosWeb(Aluno a , RedirectAttributes r) {
		//Chama o DAO
		AlunoDAO.create(a);
		r.addFlashAttribute("msg" , "Aluno Cadastrado");
		//Mandar Redirect com nome da URL e action { o initial e minha url padrao para acessar a proxima }
		return new ModelAndView("redirect:/Inicial/cadastrar");
		
	}
	
	//======================================================================================================
	
	// Listando
	
	@GetMapping("listar")
	public ModelAndView Listando() {
		return new ModelAndView("Aluno/listagem").addObject("variavel",AlunoDAO.list());
	}
	
	//======================================================================================================
	
	// Pesquisando
	
	@GetMapping("buscando")
	public ModelAndView pesquisando(String nome) {
		// Definir um input hidden com o parametro criado da url Ex: /Inicial/buscando 
		// <c:url value="/Inicial/buscando" var="acao"/>
		// Definir um input com o name="nome" para realizar a pesquisa no template
		return new ModelAndView("Aluno/listagem").addObject("variavel",AlunoDAO.BuscarPorNome(nome));
	}
	
	//======================================================================================================
	
	// Abrindo a pagina de Edicao e capturando o id para editar
		
	@GetMapping("editar/{id}")
	public ModelAndView AbrindoEdicaoPagina(@PathVariable("id") int codigo) {
		return new ModelAndView("Aluno/editando").addObject("Inicial",AlunoDAO.read(codigo));
	}
	
	
	@Transactional
	@PostMapping("editar")
	public String processarEdicao(Aluno a , RedirectAttributes r) {
		AlunoDAO.update(a);
		r.addFlashAttribute("msg","Orc atualizado");
		return "redirect:/Inicial/listar";
	}
	
	//======================================================================================================
		
	//Removendo
	
		@Transactional
		@PostMapping("remover")
		public String excluir(int codigo , RedirectAttributes r) {
			
			try {
				AlunoDAO.delete(codigo);
			}catch(KeyNotFoundException e) {
				e.printStackTrace();
			}
			
			r.addFlashAttribute("msg","excluido");
			return "redirect:/Inicial/listar";
		}
		
	//======================================================================================================
	
}


