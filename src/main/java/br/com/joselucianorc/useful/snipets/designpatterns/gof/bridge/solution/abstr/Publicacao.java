package br.com.joselucianorc.useful.snipets.designpatterns.gof.bridge.solution.abstr;

public abstract class Publicacao extends PaiPublicacao {
	
	public abstract String getTitulo();
	public abstract void setTitulo(String titulo);
	public abstract String getAutor();
	public abstract void setAutor(String autor);
}
