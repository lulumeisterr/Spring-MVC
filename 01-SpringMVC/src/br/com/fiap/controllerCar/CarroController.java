package br.com.fiap.controllerCar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.car.Carro;


/*
 * Controller - Recuperar dados enviados pelo usuário e integari com a 
 * camada model para enviar reposta ao usuario
 * 
 * Controller - Define que minha classe será um controller
 * 
 */

@Controller

/*
 * RequestMapping - Define a url que quando for requisitada chamara o metodo
 *  http://localhost:8080/01-SpringMVC/carro/cadastrar
 * 
 */

@RequestMapping("carro")

public class CarroController {
	
	// Abrindo o formulario
	
	@GetMapping("cadastrar")
	public String openForm() {
		return "automovel/carro";
	}
	
	
	// Realizando uma requisição utilizando o verbo Post dos metodos HTTP
	
	@PostMapping("cadastrar")
	public ModelAndView finishCadastro(Carro c) {
		
		/*
		 *  ModelAndView - Retorna a view que deve ser chamada, 
		 *  no caso home (carro.jsp que está na pasta automovel)
		 */
	
		
		System.out.println(c.gettPlaca() + "" + 
						   c.getCarros() + "" + 
						   c.gettPreco() + "" + 
						   c.isVehicle());
		
		ModelAndView r = new ModelAndView("automovel/carro");
		r.addObject("key" ,c);
		return r;
	
	}
}