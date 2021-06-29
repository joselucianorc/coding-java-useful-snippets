package br.com.joselucianorc.useful.snipets.designpatterns.gof.bridge.solution.concrete;

public class LivroReal extends LivroBridge {
	public LivroReal(String titulo, String autor, String isbn) {
		this.setAutor(autor);
		this.setTitulo(titulo);
		this.setIsbn(isbn);
	}
	
	public String toString() {
		return this.getTitulo() + " - " + this.getAutor() + " - " + this.getIsbn();
	}
}
