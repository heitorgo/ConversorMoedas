package com.conversor.service;

import java.math.BigDecimal;

import com.conversor.exceptions.ErroValorInputInvalidoException;
import com.conversor.model.Temperatura;

public class ConversorTemperaturaService {
	
	CriacaoMenuTemperaturaService criacaoMenuTemperaturaService;
	
	public ConversorTemperaturaService(CriacaoMenuTemperaturaService criacaoMenuTemperaturaService) {
		this.criacaoMenuTemperaturaService = criacaoMenuTemperaturaService;
	}
	
	public Temperatura valorConvercao(Object valorInput) {
		try {
			BigDecimal valor = new BigDecimal(valorInput.toString());
			Temperatura temperatura = new Temperatura(valor);
			return convercaoTemperatura(temperatura);
		}catch(NumberFormatException ex) {
			throw new ErroValorInputInvalidoException(valorInput);
		}
	}
	
	private Temperatura convercaoTemperatura(Temperatura temperatura) {
		Object convercao = criacaoMenuTemperaturaService.criacaoMenuEscolhaConvercaoTemperatura();
		switch(convercao.toString()) {
			case "De Celsius a Fahrenheit":
				temperatura.celsiusParaFahrenheit();
				break;
			case "De Fahrenheit a Celsius":
				temperatura.fahrenheitParaCelsius();
				break;
			case "De Celsius a Kelvin":
				temperatura.celsiusParaKelvin();
				break;
			case "De Kelvin a Celsius":
				temperatura.kelvinParaCelsius();
				break;
		}
		return temperatura;
	}
}
