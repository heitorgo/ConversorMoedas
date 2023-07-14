package com.conversor;

import javax.swing.JOptionPane;

public class MenuInicial extends JOptionPane{

	private static final long serialVersionUID = 1L;
	
	public MenuInicial() {
		setSize(250, 200);
		Object[] possibleValues = { "First", "Second", "Third" }; 
		showInputDialog(null, "", "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
	}

}
