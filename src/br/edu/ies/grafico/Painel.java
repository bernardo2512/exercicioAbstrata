package br.edu.ies.grafico;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Painel extends JFrame {
	
	private List<Desenhavel> desenhaveis = new ArrayList<>();
	
	public Painel(List<Desenhavel> d) {
		super("Painel");
		this.desenhaveis = d;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		for (Desenhavel d : desenhaveis) {
			d.desenhar(g);
		}

	}

}
