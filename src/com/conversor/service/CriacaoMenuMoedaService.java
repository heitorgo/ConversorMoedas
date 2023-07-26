package com.conversor.service;

public class CriacaoMenuMoedaService {
	
	private CriacaoMenuService criacaoMenuService;
	
	private final Object[] opcoes = {
			"De Reais a Dólares (USD)", "De Reais a Euro (EUR)", "De Reais a Libra (GIP)",
			"De Reais a Libra (GBP)", "De Reais a Peso (ARS)", "De Reais a Peso (CLP)",
			"De Reais a Iene (JPY)", "De Reais a Won (KRW)", "De Dólares a Reais (BRL)",
			"De Euro a Reais (BRL)", "De Libra (GIP) a Reais (BRL)", "De Libra (GBP) a Reais (BRL)",
			"De Peso (ARS) a Reais (BRL)", "De Peso (CLP) a Reais (BRL)", "De Iene a Reais (BRL)",
			"De Won (KRW) a Reais (BRL)"};
	
	public CriacaoMenuMoedaService(CriacaoMenuService criacaoMenuService) {
		this.criacaoMenuService = criacaoMenuService;
	}
	
	public Object criarMenuEscolhaConvercaoMoeda() {
		Object conversao = criacaoMenuService.criarMenuEscolha( "Escolha uma moeda para qual você deseja girar seu dinheiro",
				"Moedas", opcoes);
		return conversao;
	}

}
