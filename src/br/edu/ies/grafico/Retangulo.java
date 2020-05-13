package br.edu.ies.grafico;

import java.awt.Color;
import java.awt.Graphics;


public class Retangulo extends Desenhavel {
	private int base;
	private int altura;

	public Retangulo(int eixoX,int eixoY,int base,int altura) {
		super(eixoX,eixoY);
		this.altura = altura;
		this.base = base;
		
	}

	@Override
	public void desenhar(Graphics g) {
		g.drawRect(eixoX, eixoY,base,altura);
		g.setColor(Color.pink);
		g.fillRect(eixoX, eixoY, base, altura);
		
	}
}
