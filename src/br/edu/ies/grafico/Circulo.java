package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Desenhavel {

	private int raio;
	
	public Circulo(int eixoX,int eixoY,int raio) {
		super(eixoX,eixoY);
		this.raio = raio;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.drawOval(eixoX, eixoY, eixoX + 2 * raio, eixoY + 2 * raio);
		g.setColor(Color.RED);
		g.fillOval(eixoX, eixoY, eixoX + 2 * raio, eixoY + 2 * raio);
	}

}
