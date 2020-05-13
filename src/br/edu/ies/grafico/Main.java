package br.edu.ies.grafico;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Desenhavel> d = new ArrayList<>();
		d.add(new Retangulo(50,50,100,250));
		Painel painel = new Painel(d);
	}
	
}
