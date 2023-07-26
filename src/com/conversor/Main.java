package com.conversor;

import com.conversor.model.Janela;
import com.conversor.model.Menu;
import com.conversor.service.ConversorMoedaService;
import com.conversor.service.ConversorService;
import com.conversor.service.ConversorTemperaturaService;
import com.conversor.service.CriacaoMenuMoedaService;
import com.conversor.service.CriacaoMenuService;
import com.conversor.service.CriacaoMenuTemperaturaService;

public class Main {
	
	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.definirJanelaConversor();
		Menu menu = new Menu();
		CriacaoMenuService criacaoMenuService = new CriacaoMenuService(menu, janela);
		CriacaoMenuMoedaService criacaoMenuMoedaService = new CriacaoMenuMoedaService(criacaoMenuService);
		ConversorMoedaService conversorMoedaService = new ConversorMoedaService(criacaoMenuMoedaService);
		CriacaoMenuTemperaturaService criacaoMenuTemperaturaService = 
				new CriacaoMenuTemperaturaService(criacaoMenuService);
		ConversorTemperaturaService conversorTemperaturaService = 
				new ConversorTemperaturaService(criacaoMenuTemperaturaService);
		ConversorService conversor = new ConversorService(criacaoMenuService, conversorMoedaService,
				conversorTemperaturaService);
		conversor.loopConversor();
	}

}
