package com.conversor.service;

import java.math.BigDecimal;

import com.conversor.exceptions.ErroValorInputInvalidoException;
import com.conversor.model.Dinheiro;

public class ConversorMoedaService {
	
	private CriacaoMenuMoedaService criacaoMenuMoedaService;
	
	public ConversorMoedaService(CriacaoMenuMoedaService criacaoMenuMoedaService) {
		this.criacaoMenuMoedaService = criacaoMenuMoedaService;
	}
	
	public Dinheiro valorConvercao(Object valorInput) {
		try {
			BigDecimal valor = new BigDecimal(valorInput.toString());
			Dinheiro dinheiro = new Dinheiro(valor);
			return conversaoMoeda(dinheiro);
		}catch(NumberFormatException ex) {
			throw new ErroValorInputInvalidoException(valorInput);
		}
	}
	
	private Dinheiro conversaoMoeda(Dinheiro dinheiro) {
		Object conversao = criacaoMenuMoedaService.criarMenuEscolhaConvercaoMoeda();
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
			case "De Reais a Won(KRW)":
				dinheiro.reaisParaWonKRW();
				break;
			case "De Dólares a Reais (BRL)":
				dinheiro.dolaresParaReaisBRL();
				break;
			case "De Euro a Reais (BRL)":
				dinheiro.euroParaReaisBRL();
				break;
			case "De Libra (GIP) a Reais (BRL)":
				dinheiro.libraGIPparaReaisBRL();
				break;
			case "De Libra (GBP) a Reais (BRL)":
				dinheiro.libraGBPparaReaisBRL();
				break;
			case "De Peso (ARS) a Reais (BRL)":
				dinheiro.pesoARSparaReaisBRL();
				break;
			case "De Peso (CLP) a Reais (BRL)":
				dinheiro.pesoCLPparaReaisBRL();
				break;
			case "De Iene a Reais (BRL)":
				dinheiro.ieneJPYparaReaisBRL();
				break;
			case "De Won (KRW) a Reais (BRL)":
				dinheiro.wonKRWparaReaisBRL();
				break;
		}
		return dinheiro; 
	}

}
