package br.com.alura.mvc.mudi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repositoy.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidosRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
//		Pedido prime = new Pedido();
//		prime.setNomeProduto("Smartphone Nokia 2.3 32GB 2GB RAM Tela 6,2");
//		prime.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/613EvIt%2BivL._AC_SL1000_.jpg");
//		prime.setUrlProduto("https://www.amazon.com.br/Smartphone-Nokia-Traseira-Intelig%C3%AAncia-Artificial/dp/B088MXYRY7?ref_=Oct_DLandingS_D_b711a9cf_61&smid=A1ZZFT5FULY4LN");
//		prime.setUrlDescricao("uma descricao qualquer");
//		
//		List<Pedido> listaPeidos = Arrays.asList(prime);
		
		List<Pedido> pedidos = pedidosRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
