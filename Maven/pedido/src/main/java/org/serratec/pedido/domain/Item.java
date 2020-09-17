package org.serratec.pedido.domain;

public class Item {
	
	private Integer id;
	private String tipo;
	private String descricao;
	private Double valor;
	
	public Item(Integer id, String tipo, String descricao, Double valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
