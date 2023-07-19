package com.conversor.model;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Menu extends JOptionPane{

	private static final long serialVersionUID = 1L;
	
	public Object criarMenuInput(Component janela, String mensagemInput, String mensagemTitulo, Object[] opcoes) {
		Object escolha = showInputDialog(janela, mensagemInput, mensagemTitulo, QUESTION_MESSAGE,
				null, opcoes, opcoes[0]);
		return escolha;
	}
	
	public Object criarMenuInput(Component janela, String mensagemInput, String mensagemTitulo) {
		Object valor = showInputDialog(janela, mensagemInput, mensagemTitulo, QUESTION_MESSAGE,
				null, null, null);
		return valor;
	}
	
	public void criarMenuMensagem(Component janela, String mensagemMenu, String mensagemTitulo) {
		showMessageDialog(janela, mensagemMenu, mensagemTitulo, INFORMATION_MESSAGE, null);
	}
	
	public void criarMenuErroMensagem(Component janela, String mensagemMenu, String mensagemTitulo) {
		showMessageDialog(janela, mensagemMenu, mensagemTitulo, ERROR_MESSAGE, null);
	}
	
	public int criarMenuConfirmacao(Component janela, String mensagemMenu, String mensagemTitulo) {
		return showConfirmDialog(janela, mensagemMenu, mensagemTitulo, YES_NO_CANCEL_OPTION);
	}

}
