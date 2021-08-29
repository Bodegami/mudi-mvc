package br.com.bode.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bode.mvc.mudi.dto.NovoPedidoRequest;
import br.com.bode.mvc.mudi.model.Pedido;
import br.com.bode.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
	
	private final PedidoRepository pedidoRepository;
	
	public PedidoController(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	@GetMapping("/formulario")
	public String formulario(NovoPedidoRequest request) {
		return "pedido/formulario";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid NovoPedidoRequest request, BindingResult result) {
		if (result.hasErrors() ) {
			return "pedido/formulario";
		}
		Pedido pedido = request.toPedido();
		pedidoRepository.save(pedido);
		return "redirect:/home";
	}
	
}
