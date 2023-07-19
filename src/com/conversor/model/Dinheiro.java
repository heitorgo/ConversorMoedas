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
		taxaConvercao = new BigDecimal("0.2085");
		tipo = "Dólar (USD)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaEuroEUR() {
		taxaConvercao = new BigDecimal("0.1855");
		tipo = "Euro (EUR)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaLibraGIP() {
		taxaConvercao = new BigDecimal("0.159");
		tipo = "Libra (GIP)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaLibraGBP() {
		taxaConvercao = new BigDecimal("0.1615");
		tipo = "Libra (GBP)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaPesoARS() {
		taxaConvercao = new BigDecimal("55.8659");
		tipo = "Peso (ARS)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaPesoCLP() {
		taxaConvercao = new BigDecimal("168.8619");
		tipo = "Peso (CLP)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaIeneJPY() {
		taxaConvercao = new BigDecimal("28.9185");
		tipo = "Iene (JPY)";
		valor = valor.multiply(taxaConvercao);
		valor = valor.setScale(4, RoundingMode.HALF_EVEN);
	}
	
	public void reaisParaWonKRW() {
		taxaConvercao = new BigDecimal("262.8121");
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
		taxaConvercao = new BigDecimal("4.8034");
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
