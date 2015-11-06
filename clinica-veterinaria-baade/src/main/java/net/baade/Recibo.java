package net.baade;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


public class Recibo {
	private String nomeCliente;
	private String nomeAnimal;
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public Float getValorAtendimento() {
		return valorAtendimento;
	}

	public void setValorAtendimento(Float valorAtendimento) {
		this.valorAtendimento = valorAtendimento;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	private Float valorAtendimento = new Float( 0 );
	@Setter( AccessLevel.PRIVATE )
	private List<Item> itens;

	public void listaItemAdd( Item item ) {
		if ( itens == null ) {
			itens = new ArrayList<Item>();
		}
		itens.add( item );
		this.valorAtendimento += item.getValor();
	}
}
