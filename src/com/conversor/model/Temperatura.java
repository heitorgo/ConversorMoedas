package com.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Temperatura {
	
	private BigDecimal valor;
	private String tipo;
	
	public Temperatura(BigDecimal valor) {
		this.valor=valor;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void celsiusParaFahrenheit() {
		valor = valor.multiply(new BigDecimal(1.8));
		valor = valor.add(new BigDecimal(32));
		valor = valor.setScale(1, RoundingMode.HALF_EVEN);
		tipo = "F°";
	}
	
	public void fahrenheitParaCelsius() {
		valor = valor.subtract(new BigDecimal(32));
		valor = valor.divide(new BigDecimal(1.8), RoundingMode.HALF_UP);
		valor = valor.setScale(1, RoundingMode.HALF_EVEN);
		tipo = "C°";
	}
	
	public void celsiusParaKelvin() {
		valor = valor.add(new BigDecimal(273.15));
		tipo = "K°";
	}
	
	public void kelvinParaCelsius() {
		valor = valor.subtract(new BigDecimal(273.15));
		tipo = "C°";
	}

}
