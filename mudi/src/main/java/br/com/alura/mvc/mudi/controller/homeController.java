package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class homeController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/home")
	public String home(Model model) {
//		Pedido prime = new Pedido();
//		prime.setNomeProduto("Smartphone Nokia 2.3 32GB 2GB RAM Tela 6,2");
//		prime.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/613EvIt%2BivL._AC_SL1000_.jpg");
//		prime.setUrlProduto("https://www.amazon.com.br/Smartphone-Nokia-Traseira-Intelig%C3%AAncia-Artificial/dp/B088MXYRY7?ref_=Oct_DLandingS_D_b711a9cf_61&smid=A1ZZFT5FULY4LN");
//		prime.setUrlDescricao("uma descricao qualquer");
//		
//		List<Pedido> listaPeidos = Arrays.asList(prime);
		
		Query query = entityManager.createQuery("Select p from Pedido p");
		List<Pedido> pedidos = query.getResultList();
		
		
		
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
