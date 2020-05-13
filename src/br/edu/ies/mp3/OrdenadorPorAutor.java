package br.edu.ies.mp3;

public class OrdenadorPorAutor extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.getAutor().compareToIgnoreCase(musica2.getAutor()) <= 0) {
			return true;
		}
		return false;
	}

}