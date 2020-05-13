package br.edu.ies.mp3;

public class OrdenadorPorAno extends OrdenadorTemplate {

	
	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.getAno().compareToIgnoreCase(musica2.getAno()) <= 0) {
			return true;
		}
		return false;
	}

}
