package com.conversor.service;

import com.conversor.model.Janela;
import com.conversor.model.Menu;

public class CriacaoMenuMoedaService {
	
	private Menu menu;
	private Janela janela;
	public final Object[] opcoes = {
			"De Reais a D�lares (USD)", "De Reais a Euro (EUR)", "De Reais a Libra (GIP)",
			"De Reais a Libra (GIP)", "De Reais a Peso (ARS)", "De Reais a Peso (CLP)",
			"De Reais a Iene (JPY)", "De Reais a Won Sul Coreano (KRW)", "De D�lares a Reais (BRL)"};
	
	public CriacaoMenuMoedaService(Menu menu, Janela janela) {
		this.menu = menu;
		this.janela = janela;
	}
	
	public Object criarMenuInputValor() {
		Object valor = menu.criarMenuInput(this.janela, "Insira um valor", "Valor para convers�o");
		return valor;
	}
	
	public Object criarMenuEscolhaConvercaoMoeda() {
		Object conversao = menu.criarMenuInput(this.janela, "Escolha uma moeda para qual voc� deseja girar seu dinheiro",
				"Moedas", opcoes);
		return conversao;
	}

}
