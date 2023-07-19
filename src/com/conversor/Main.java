package com.conversor;

import com.conversor.model.Janela;
import com.conversor.model.Menu;
import com.conversor.service.ConversorMoedaService;
import com.conversor.service.ConversorService;
import com.conversor.service.CriacaoMenuMoedaService;
import com.conversor.service.CriacaoMenuService;

public class Main {
	
	public static void main(String[] args) {
		Janela janela = new Janela();
		Menu menu = new Menu();
		CriacaoMenuService criacaoMenuService = new CriacaoMenuService(menu, janela);
		CriacaoMenuMoedaService criacaoMenuMoedaService = new CriacaoMenuMoedaService(menu, janela);
		ConversorMoedaService conversorMoedaService = new ConversorMoedaService(criacaoMenuMoedaService);
		ConversorService conversor = new ConversorService(criacaoMenuService, conversorMoedaService);
		conversor.loopConversor();
	}

}
