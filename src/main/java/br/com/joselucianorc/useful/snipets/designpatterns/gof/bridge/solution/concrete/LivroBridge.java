package br.com.joselucianorc.useful.snipets.designpatterns.gof.bridge.solution.concrete;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.bridge.solution.abstr.Livro;

public class LivroBridge extends Livro {

	@Override
	public String getIsbn() {
		return this.isbn;
	}

	@Override
	public void setIsbn(String isbn) {
		this.isbn = isbn;		
	}

	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;		
	}

	@Override
	public String getAutor() {
		return this.autor;
	}

	@Override
	public void setAutor(String autor) {
		this.autor = autor;		
	}
}
