package com.conversor.model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private final String imgPath= "C:\\PROJECTS\\Eclipse\\conversorMoedas\\src\\assets\\img";
	ArquivoImagem imagem = new ArquivoImagem(imgPath +"\\background-pixabay.png");
	
	public void criarJanelaConversor() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,543);  
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Conversor");
		criarImagemFundo();
	}
	
	private void criarImagemFundo() {
		try {
			BufferedImage imagemBackground = ImageIO.read(imagem);
			 setContentPane(new ImagemPainel(imagemBackground));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
