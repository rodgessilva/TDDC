import java.awt.List;
import java.math.BigDecimal;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.StringConverter;
import org.junit.Assert;
import net.baade.*;
public class AtendimentoRotinaTeste {

Recibo recibo = new Recibo();
	
@Given("^um cliente com nome \"([^\"]*)\" que tem um animal de nome \"([^\"]*)\"$")
public void um_cliente_com_nome_que_tem_um_animal_de_nome(String cliente, String animal) throws Throwable {
	recibo.setNomeCliente( cliente );
	recibo.setNomeAnimal( animal);
	
}

@Given("^um servico de \"([^\"]*)\" que custa \"([^\"]*)\"$")
public void um_servico_de_que_custa(String procedimento, String valorProcedimento) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BigDecimal valorProcedimentos = new BigDecimal( valorProcedimento );
	recibo.listaItemAdd(new Item(procedimento, valorProcedimentos));
 
}

@Given("^um outro servico de \"([^\"]*)\" que custa \"([^\"]*)\"$")
public void um_outro_servico_de_que_custa(String procedimento, String valorProcedimento) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BigDecimal valorProcedimentos = new BigDecimal( valorProcedimento );
	recibo.listaItemAdd(new Item(procedimento, valorProcedimentos));
}

@When("^o cliente pagar em \"([^\"]*)\"$")
public void o_cliente_pagar_em(String pagamento) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue( pagamento.equals( "Dinheiro" ) );
    throw new PendingException();
}

@Then("^o recibo deve ter (\\d+) servicos$")
public void o_recibo_deve_ter_servicos(int servicos) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	int quantidadeServicosRecibo = recibo.getItens().size();
	Assert.assertEquals(quantidadeServicosRecibo, servicos);

}

@Then("^o servico (\\d+) deve ser \"([^\"]*)\"$")
public void o_servico_deve_ser(int procedimento1, String procedimento2) throws Throwable {
	switch ( procedimento1 ) {
	case 1:
		Assert.assertEquals( procedimento2, "vacinacao contra raiva" );
		break;

	default:
		Assert.assertEquals( procedimento2, "consulta de rotina" );
		break;
}
}


@Then("^o valor total do recibo deve ser \"([^\"]*)\"$")
public void o_valor_total_do_recibo_deve_ser(String valorTotal) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BigDecimal total = new BigDecimal( valorTotal );
	Assert.assertEquals( recibo.getValorAtendimento(), total );
   
}

}
