package br.edu.ies.grafico;


import java.awt.Color;
import java.awt.Graphics;

public class Texto extends Desenhavel {
	private String texto;
	

	public Texto(int eixoX,int eixoY,String string) {
		super(eixoX,eixoY);
		this.texto = string;
		
	}

	@Override
	public void desenhar(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString(texto, eixoX, eixoY);
		
	}

}
