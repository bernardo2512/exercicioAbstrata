package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Quadrado extends Desenhavel {
	private int lado;
	

	public Quadrado(int eixoX,int eixoY,int lado) {
		super(eixoX,eixoY);
		this.lado = lado;
		
	}

	@Override
	public void desenhar(Graphics g) {
		g.drawRect(eixoX, eixoY,lado,lado);
		g.setColor(Color.RED);
		g.fillRect(eixoX, eixoY, lado, lado);
		
	}
}


