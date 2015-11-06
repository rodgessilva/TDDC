package net.baade;

import lombok.Data;

public class Item {
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Item(String descricao, Float valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	private String descricao;
	private Float valor;

}
