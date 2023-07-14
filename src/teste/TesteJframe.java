package teste;

import com.conversor.JanelaPrincipal;
import com.conversor.MenuInicial;

public class TesteJframe {
	
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		MenuInicial menu = new MenuInicial();
		janela.add(menu);
	}

}
