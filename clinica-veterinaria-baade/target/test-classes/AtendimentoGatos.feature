Feature: Atendimento Gatos




	To permitir o faturamento dos servicos prestados aos clientes 
	
	Scenario: Castração e Esterelização
		Given um cliente com nome "Traci Heinrich" que tem dois animais de nomes "Tweedle Dee" e "Tweedle Dum"
		And um servico de "Castração" 
		And um outro servico de "Esterelização"
	When o cliente vai pagar em "Boleto"
	Then o recibo deve ter 4 servicos
		And o servico 1 deve ser "Castração"
		And o servico 2 deve ser "Castração"
		And o servico 1 deve ser "Esterelização"
		And o servico 2 deve ser "Esterelização"
	 