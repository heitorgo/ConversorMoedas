package com.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinheiro{
	
	private BigDecimal valor;
	private String tipo;
	private BigDecimal taxaConvercao;
	
	public Dinheiro(BigDecimal valor) {
		this.valor = valor;
	}
	
	public void reaisParaDolarUSD() {
		taxaConvercao = new BigDecimal("0.2095");
		tipo = "Dólar (USD)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaEuroEUR() {
		taxaConvercao = new BigDecimal("0.1884");
		tipo = "Euro (EUR)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaLibraGIP() {
		taxaConvercao = new BigDecimal("0.1624");
		tipo = "Libra (GIP)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaLibraGBP() {
		taxaConvercao = new BigDecimal("0.163");
		tipo = "Libra (GBP)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaPesoARS() {
		taxaConvercao = new BigDecimal("56.4334");
		tipo = "Peso (ARS)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaPesoCLP() {
		taxaConvercao = new BigDecimal("173.0403");
		tipo = "Peso (CLP)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaIeneJPY() {
		taxaConvercao = new BigDecimal("29.6912");
		tipo = "Iene (JPY)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaWonKRW() {
		taxaConvercao = new BigDecimal("269.9055");
		tipo = "Won Sul Coreano (KRW)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void dolaresParaReaisBRL() {
		taxaConvercao = new BigDecimal("4.8034");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void euroParaReaisBRL() {
		taxaConvercao = new BigDecimal("5.3057");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void libraGIPparaReaisBRL() {
		taxaConvercao = new BigDecimal("6.1519");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void libraGBPparaReaisBRL() {
		taxaConvercao = new BigDecimal("6.1328");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void pesoARSparaReaisBRL() {
		taxaConvercao = new BigDecimal("0.0177");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void pesoCLPparaReaisBRL() {
		taxaConvercao = new BigDecimal("0.0058");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void ieneJPYparaReaisBRL() {
		taxaConvercao = new BigDecimal("0.0337");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void wonKRWparaReaisBRL() {
		taxaConvercao = new BigDecimal("0.0037");
		tipo = "Real (BRL)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public String getTipo() {
		return this.tipo;
	}

}
