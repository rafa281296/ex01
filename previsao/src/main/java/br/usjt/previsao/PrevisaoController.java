package br.usjt.previsao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoRepository previsaoRepo;

	@GetMapping("/previsao")
	public ModelAndView listarAlunos() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_prev");
		// Busque a coleção com o repositório
		List<Previsao> previ = previsaoRepo.findAll();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject(new Previsao());
		// devolva o ModelAndView
		return mv;
	}
	
	@PostMapping("/previsao")
	public String salvar (Previsao previsoes) {
	previsaoRepo.save(previsoes);
	return "redirect:/alunos";
	}
}
