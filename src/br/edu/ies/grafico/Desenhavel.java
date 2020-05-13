package br.edu.ies.grafico;

import java.awt.Graphics;

public abstract class Desenhavel {
	protected int eixoX;
	protected int eixoY;

	public Desenhavel(int eixoX, int eixoY) {
		this.eixoX = eixoX;
		this.eixoY = eixoY;
	}


	public abstract void desenhar(Graphics g);

}
