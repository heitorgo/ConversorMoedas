package com.conversor.service;

import com.conversor.exceptions.ErroValorInputInvalidoException;
import com.conversor.model.Dinheiro;
import com.conversor.model.Temperatura;

public class ConversorService {

	private CriacaoMenuService criacaoMenuService;
	private ConversorMoedaService conversorMoedaService;
	private ConversorTemperaturaService conversorTemperaturaService;
	private Boolean loop=true;
	private Object valorInput;
	
	public ConversorService( CriacaoMenuService criacaoMenuService, ConversorMoedaService conversorMoedaService,
			ConversorTemperaturaService conversorTemperaturaService) {
		this.criacaoMenuService = criacaoMenuService;
		this.conversorMoedaService = conversorMoedaService;
		this.conversorTemperaturaService = conversorTemperaturaService;
	}
	
	public void loopConversor() {
		while(loop) {
			escolhaConversor();
			verificarContinuacao();
		}
		criacaoMenuService.criarMenuMensagem("Programa finalizado");
		System.exit(0);
	}
	
	private void escolhaConversor() {
		try {
			Object escolha = criacaoMenuService.criarMenuEscolhaConversor();
			switch(escolha.toString()) {
				case "Conversor de moedas":
					valorInput = criacaoMenuService.criarMenuInputValor();
					converterMoeda(valorInput);
					break;
				case "Conversor de temperatura":
					valorInput = criacaoMenuService.criarMenuInputValor();
					converterTemperatura(valorInput);
					break;
			}
		}catch(NullPointerException ex) {}
	}
	
	private void converterMoeda(Object valorInput) {
		try {
			Dinheiro dinheiro = conversorMoedaService.valorConvercao(valorInput);
			criacaoMenuService.criarMenuMensagem(String.format("O valor da conversão é %s %s",
				dinheiro.getValor(), dinheiro.getTipo()));
		}catch(ErroValorInputInvalidoException ex) {
			criacaoMenuService.criarMenuErroMensagem(ex.getMessage());
		}
	}
	
	private void converterTemperatura(Object valorInput) {
		try {
			Temperatura temperatura = conversorTemperaturaService.valorConvercao(valorInput);
			criacaoMenuService.criarMenuMensagem(String.format("O valor da conversão é %s %s",
					temperatura.getValor(), temperatura.getTipo()));
		}catch(ErroValorInputInvalidoException ex) {
			criacaoMenuService.criarMenuErroMensagem(ex.getMessage());
		}
	}
	
	private void verificarContinuacao(){
		int confirmacao = criacaoMenuService.criarMenuConfirmacao("Deseja continuar?", "Select an Option");
		switch(confirmacao) {
			case 0:
				break;
			case 1:
				loop=false;
				break;
			case 2:
				loop=false;
				break;
		}
	}

}
