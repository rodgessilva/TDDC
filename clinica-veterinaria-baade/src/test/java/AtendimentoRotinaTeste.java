import java.awt.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.baade.*;
public class AtendimentoRotinaTeste {
Cliente cliente = new Cliente();

Animal animal = new Animal();
Procedimento procedimento = new Procedimento();

Recibo recibo = new Recibo();
	
@Given("^um cliente com nome \"([^\"]*)\" que tem um animal de nome \"([^\"]*)\"$")
public void um_cliente_com_nome_que_tem_um_animal_de_nome(String cliente, String animal) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	throw new PendingException();
}

@Given("^um servico de \"([^\"]*)\" que custa \"([^\"]*)\"$")
public void um_servico_de_que_custa(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
    throw new PendingException(); 
}

@Given("^um outro servico de \"([^\"]*)\" que custa \"([^\"]*)\"$")
public void um_outro_servico_de_que_custa(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^o cliente pagar em \"([^\"]*)\"$")
public void o_cliente_pagar_em(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^o recibo deve ter (\\d+) servicos$")
public void o_recibo_deve_ter_servicos(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^o servico (\\d+) deve ser \"([^\"]*)\"$")
public void o_servico_deve_ser(int arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^o valor total do recibo deve ser \"([^\"]*)\"$")
public void o_valor_total_do_recibo_deve_ser(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
