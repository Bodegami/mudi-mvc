package br.com.bode.mvc.mudi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bode.mvc.mudi.model.Pedido;
import br.com.bode.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {
	
	private PedidoRepository pedidoRepository;
	
	public HomeController(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
	

	@GetMapping("/home")
	public ModelAndView home(Model model) {
		List<Pedido> pedidos = pedidoRepository.findAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("pedidos", pedidos);
		return mv;
	}
	
}
