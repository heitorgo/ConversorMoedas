package com.conversor.service;

import com.conversor.model.Janela;
import com.conversor.model.Menu;

public class CriacaoMenuService {
	
	private Menu menu;
	private Janela janela;
	private Object[] opcoes = {"Conversor de moedas", "Conversor de temperatura"};
	
	public CriacaoMenuService(Menu menu, Janela janela) {
		this.menu=menu;
		this.janela=janela;
	}
	
	public Object criarMenuInput(String mensagemTitulo, String mensagemInput) {
		Object input = menu.criarMenuInput(janela, mensagemInput, mensagemTitulo);
		return input;
	}
	
	public Object criarMenuInputValor() {
		Object valorInput = menu.criarMenuInput(janela, "Insira um valor", "Input");
		return valorInput;
	}
	
	public Object criarMenuEscolha(String mensagemInput, String mensagemTitulo, Object[] opcoes) {
		Object escolha = menu.criarMenuInput(janela, mensagemInput, mensagemTitulo, opcoes);
		return escolha;
	}
	
	public Object criarMenuEscolhaConversor() {
		Object escolha = menu.criarMenuInput(janela, "Escolha uma opção", "Menu", opcoes);
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
