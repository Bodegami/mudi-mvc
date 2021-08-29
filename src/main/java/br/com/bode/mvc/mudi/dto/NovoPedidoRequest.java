package br.com.bode.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.bode.mvc.mudi.model.Pedido;

public class NovoPedidoRequest {

	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagemProduto;
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagemProduto() {
		return urlImagemProduto;
	}

	public void setUrlImagemProduto(String urlImagemProduto) {
		this.urlImagemProduto = urlImagemProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlDoProduto(urlProduto);
		pedido.setUrlDaImagem(urlImagemProduto);
		pedido.setDescricao(descricao);
		return pedido;
	}

	@Override
	public String toString() {
		return "NovoPedidoRequest [nomeProduto=" + nomeProduto + ", urlProduto=" + urlProduto + ", urlImagemProduto="
				+ urlImagemProduto + ", descricao=" + descricao + "]";
	}
	
	

}
