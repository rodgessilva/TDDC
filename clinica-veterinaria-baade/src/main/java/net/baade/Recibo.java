package net.baade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


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

	public BigDecimal getValorAtendimento() {
		return valorProcedimento;
	}

	public void setValorAtendimento(BigDecimal valorProcedimento) {
		this.valorProcedimento = valorProcedimento;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	private BigDecimal valorProcedimento = new BigDecimal( 0 );

	private List<Item> itens;

	public void listaItemAdd( Item item ) {
		if ( itens == null ) {
			itens = new ArrayList<Item>();
		}
		itens.add( item );
		this.valorProcedimento = this.valorProcedimento.add( item.getValor() );
	}
}
