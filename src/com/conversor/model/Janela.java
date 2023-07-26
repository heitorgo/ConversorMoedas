package com.conversor.model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private final String imgPath= System.getProperty("user.dir");
	ArquivoImagem imagemBackground = new ArquivoImagem(imgPath +"\\assets\\\\img\\Background.png");
	
	public void definirJanelaConversor() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,543);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Conversor");
		definirImagemFundo(imagemBackground);
	}
	
	private void definirImagemFundo(ArquivoImagem imagem) {
		try {
			BufferedImage imagemBackground = ImageIO.read(imagem);
			setContentPane(new ImagemPainel(imagemBackground));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
