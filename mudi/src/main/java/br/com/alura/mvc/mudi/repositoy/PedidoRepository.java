package br.com.alura.mvc.mudi.repositoy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Pedido> recuperaTodosPedidos(){
		Query query = entityManager.createQuery("Select p from Pedido p");
		List<Pedido> pedidos = query.getResultList();
		return pedidos;
	}

}
