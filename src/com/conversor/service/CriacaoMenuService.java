package com.conversor.service;

import com.conversor.model.Janela;
import com.conversor.model.Menu;

public class CriacaoMenuService {
	
	private Menu menu;
	private Janela janela;
	private static final Object[] opcoes = {
			"Conversor de moedas"};
	
	public CriacaoMenuService(Menu menu, Janela janela) {
		this.menu=menu;
		this.janela=janela;
	}
	
	public void criarJanelaConversor() {
		janela.criarJanelaConversor();
	}
	
	public Object criarMenuEscolhaConversor() {
		Object escolha = menu.criarMenuInput(this.janela, "Escolha uma opção", "Menu", opcoes);
		return escolha;
	}
	
	public void criarMenuMensagem(String mensagem) {
		menu.criarMenuMensagem(janela, mensagem, "Message");
	}
	
	public void criarMenuErroMensagem(String mensagem) {
		menu.criarMenuErroMensagem(janela, mensagem, "Message");
	}
	
	public int criarMenuConfirmacao(String mensagem, String titulo) {
		return menu.criarMenuConfirmacao(janela, mensagem, titulo);
	}

}
