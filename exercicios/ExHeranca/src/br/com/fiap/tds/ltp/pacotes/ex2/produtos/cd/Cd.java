package br.com.fiap.tds.ltp.pacotes.ex2.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.produtos.Produto;

public class Cd extends Produto {
	private String artista;
	private String album;
	
	public Cd(String autor, String titulo, String isbn, int codigo, int preco, String artista, String album) {
		super(autor, titulo, isbn, codigo, preco);
		this.artista = artista;
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
}