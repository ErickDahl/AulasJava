package org.serratec.pedido.domain;

import java.util.List;

public class Pedido {
	
	private Integer numero;
	private Integer mesa;
	private List<Item> itens;
	private String nomeGarcon;
	
	public Pedido(Integer numero, Integer mesa, List<Item> itens, String nomeGarcon) {
		this.numero = numero;
		this.mesa = mesa;
		this.itens = itens;
		this.nomeGarcon = nomeGarcon;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public String getNomeGarcon() {
		return nomeGarcon;
	}

	public void setNomeGarcon(String nomeGarcon) {
		this.nomeGarcon = nomeGarcon;
	}
	
}
