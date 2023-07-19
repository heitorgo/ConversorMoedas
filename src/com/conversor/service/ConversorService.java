package com.conversor.service;

import com.conversor.exceptions.ErroCancelamentoOperacao;
import com.conversor.exceptions.ErroConvercaoValorException;
import com.conversor.model.Dinheiro;

public class ConversorService {

	private CriacaoMenuService criacaoMenuService;
	private ConversorMoedaService conversorMoedaService;
	private Boolean loop=true;
	
	public ConversorService( CriacaoMenuService criacaoMenuService, ConversorMoedaService conversorMoedaService) {
		this.criacaoMenuService = criacaoMenuService;
		this.conversorMoedaService = conversorMoedaService;
	}
	
	public void loopConversor() {
		criacaoMenuService.criarJanelaConversor();
		while(loop) {
			try {
				escolhaConversor();
			}catch(ErroCancelamentoOperacao ex) {}
			criarMenuContinuacao();
		}
		criacaoMenuService.criarMenuMensagem("Programa finalizado");
		System.exit(0);
	}
	
	private void escolhaConversor() {
		try {
			Object escolha = criacaoMenuService.criarMenuEscolhaConversor();
			switch(escolha.toString()) {
				case "Conversor de moedas":
					criarConversorMoeda();
					break;
				case "Conversor de temperatura":
					break;
			}
		}catch(NullPointerException ex) {
			throw new ErroCancelamentoOperacao();
		}
	}
	
	private void criarConversorMoeda() {
		try{
			Dinheiro dinheiroConvercao = conversorMoedaService.valorMoedaConvercao();
			criacaoMenuService.criarMenuMensagem(String.format("O valor da conversão é de %s %s",
				dinheiroConvercao.getValor(),dinheiroConvercao.getTipo()));
		}catch(ErroConvercaoValorException ex) {
			this.criacaoMenuService.criarMenuErroMensagem(ex.getMessage());
		}
	}
	
	private void criarMenuContinuacao(){
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
