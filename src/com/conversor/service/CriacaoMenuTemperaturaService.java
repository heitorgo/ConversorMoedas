package com.conversor.service;

public class CriacaoMenuTemperaturaService {
	
	CriacaoMenuService criacaoMenuService;
	private final Object[] opcoes = {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius",
			"De Celsius a Kelvin", "De Kelvin a Celsius"};
	
	public CriacaoMenuTemperaturaService(CriacaoMenuService criacaoMenuService) {
		this.criacaoMenuService = criacaoMenuService;
	}
	
	public Object criacaoMenuEscolhaConvercaoTemperatura() {
		Object convercao = criacaoMenuService.criarMenuEscolha(
				"Escolha o tipo de converção de temperatura que deseja realizar neste valor", 
				"Temperaturas", opcoes);
		return convercao;
	}

}
