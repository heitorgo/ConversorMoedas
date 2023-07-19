package com.conversor.service;

import java.math.BigDecimal;

import com.conversor.exceptions.ErroConvercaoValorException;
import com.conversor.model.Dinheiro;

public class ConversorMoedaService {
	
	private CriacaoMenuMoedaService criacaoMenuMoedaService;
	Object valorInput;
	BigDecimal valor;
	Dinheiro dinheiro;
	private static final String mensagemErroConvercao = "O valor %s não é aceito pelo conversor. "
			+ "Por favor informe apenas números";
	
	public ConversorMoedaService(CriacaoMenuMoedaService criacaoMenuMoedaService) {
		this.criacaoMenuMoedaService = criacaoMenuMoedaService;
	}
	
	public Dinheiro valorMoedaConvercao() {
		try {
			this.valorInput = criacaoMenuMoedaService.criarMenuInputValor();
			this.valor = new BigDecimal(valorInput.toString());
			this.dinheiro = new Dinheiro(valor);
			return conversaoMoeda(dinheiro);
		}catch(NumberFormatException ex) {
			throw new ErroConvercaoValorException(String.format(mensagemErroConvercao, valorInput));
		}
	}
	
	private Dinheiro conversaoMoeda(Dinheiro dinheiro) {
		Object conversao = this.criacaoMenuMoedaService.criarMenuEscolhaConvercaoMoeda();
		switch(conversao.toString()) {
			case "De Reais a Dólares (USD)":
				dinheiro.reaisParaDolarUSD();
				break;
			case "De Reais a Euro (EUR)":
				dinheiro.reaisParaEuroEUR();
				break;
			case "De Reais a Libra (GIP)":
				dinheiro.reaisParaLibraGIP();
				break;
			case "De Reais a Libra (GBP)":
				dinheiro.reaisParaLibraGBP();
				break;
			case "De Reais a Peso (ARS)":
				dinheiro.reaisParaPesoARS();
				break;
			case "De Reais a Peso (CLP)":
				dinheiro.reaisParaPesoCLP();;
				break;
			case "De Reais a Iene (JPY)":
				dinheiro.reaisParaIeneJPY();
				break;
			case "De Reais a Won Sul Coreano (KRW)":
				dinheiro.reaisParaWonKRW();
				break;
			case "De Dólares a Reais (BRL)":
				dinheiro.dolaresParaReaisBRL();
				break;
		}
		return dinheiro; 
	}

}
