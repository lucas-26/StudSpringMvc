package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "Pedido")
public class Pedido {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nomeProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataEntrega;
	private String urlProduto;
	private String urlImagem;
	private String urlDescricao;
	
	@Enumerated(EnumType.STRING)  
	private StatusPedido statusdopedido; 
	
	public StatusPedido getStatusdopedido() {
		return statusdopedido;
	}
	public void setStatusdopedido(StatusPedido statusdopedido) {
		this.statusdopedido = statusdopedido;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}
	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getUrlDescricao() {
		return urlDescricao;
	}
	public void setUrlDescricao(String urlDescricao) {
		this.urlDescricao = urlDescricao;
	}

}
