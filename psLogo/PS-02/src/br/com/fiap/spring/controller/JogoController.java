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
import br.com.fiap.spring.dao.JogoDAO;
import br.com.fiap.spring.model.Jogo;
import br.com.fiap.spring.model.Plataforma;

@Controller
@RequestMapping("jogo")
public class JogoController {

	@Autowired()
	private JogoDAO jogoDAO;
	
	@Autowired
	private GeneroDAO generoDao;
	
	//=================Cadastro=====================================]
	// Aqui eu Passo o link para onde será direcionado a minha pagina
	// Retorno o meu modelAndView passando a pasta de onde se encontra o meu html em seguida
	// O parametro recuperado do html que esta realizando o forEach
	
	@GetMapping("CadastroTipojogo")
	public ModelAndView exibeJogo(Jogo jogo) {
		return new ModelAndView("jogo/cadastrarJogo").addObject("generos", generoDao.listar());
	}
	
	@Transactional
	@PostMapping("CadastroTipojogo")
	public ModelAndView CadastrarJogoProcess(Jogo jogo , RedirectAttributes r) {
		jogoDAO.cadastrar(jogo);
		r.addFlashAttribute("msg", "Jogo Cadastrado com Sucesso");
		return new ModelAndView("redirect:/jogo/CadastroTipojogo");
	}
	
	
	//=======================Exibir_Listagem======================================

	@GetMapping("Listagem")
	public ModelAndView ExibirListagem() {
		return new ModelAndView("jogo/listagem").addObject("exibejogos",jogoDAO.listar());
	}
 
	//========================Excluir Atributo======================================
	
	// o Name no HTML deve ser Identico na assinatura do metodo
	
	@Transactional
	@PostMapping("remover")
	public String excluirID(int codigo , RedirectAttributes r) {
		try {
		jogoDAO.excluir(codigo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		r.addFlashAttribute("msgExcluir", "Valor Excluido");
		return "redirect:/jogo/Listagem";
	}
	
	//========================Disponibilizar Atributo======================================
	
		// o Name no HTML deve ser Identico na assinatura do metodo
	
		@Transactional
		@PostMapping("disponibilizar")
		public String disponibilizar(int codigo , RedirectAttributes r) {
			try {
				jogoDAO.disponibilizar(codigo);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			r.addFlashAttribute("msgDisponivel", "Disponibilizado");
			r.addFlashAttribute("msgIndisponivel", "Indisponivel");
			
			return "redirect:/jogo/Listagem";
		}
		
		
	//======================== Buscando ======================================
		
		@GetMapping("buscar")
		public ModelAndView buscarPorNome (String nome) {
			//Esta variavel se refere-se a variavel criada no forEach
			return new ModelAndView("jogo/listagem").addObject("exibejogos",jogoDAO.buscarPorNome(nome));
		}
	
}
	

