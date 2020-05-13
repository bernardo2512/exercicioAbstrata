package br.edu.ies.mp3;

public enum ModoDeReproducao {
	porNome( new OrdenadorPorNome()),
	porAutor(new OrdenadorPorAutor()),
	porAno(new OrdenadorPorAno()),
	porEstrela(new OrdenadorPorEstrela());

	private OrdenadorTemplate ordenador;
	
	private ModoDeReproducao(OrdenadorTemplate ordenador) {
		this.ordenador = ordenador;
	}
	 public OrdenadorTemplate getOrdenador() {
		 return ordenador;
	 }
	
	
	

	
	
}