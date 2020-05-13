package br.edu.ies.mp3;

public class OrdenadorPorNome extends OrdenadorTemplate {


	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.getNome().compareToIgnoreCase(musica2.getNome()) <= 0) {
			return true;
		}
		return false;
	}

}
