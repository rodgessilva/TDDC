import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class AtendimentoGatosTeste {



@Given("^um cliente com nome \"([^\"]*)\" que tem dois animais de nomes \"([^\"]*)\" e \"([^\"]*)\"$")
public void um_cliente_com_nome_que_tem_dois_animais_de_nomes_e(String arg1, String arg2, String arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}
 
@Given("^um servico de \"([^\"]*)\"$")
public void um_servico_de(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

@Given("^um outro servico de \"([^\"]*)\"$")
public void um_outro_servico_de(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@When("^o cliente vai pagar em \"([^\"]*)\"$")
public void o_cliente_vai_pagar_em(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

	
}
