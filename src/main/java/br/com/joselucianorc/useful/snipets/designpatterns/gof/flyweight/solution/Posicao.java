package br.com.joselucianorc.useful.snipets.designpatterns.gof.flyweight.solution;

public class Posicao {
	private int row;
	public Posicao(int row) {
		this.row = row;		
		System.out.println("Criado objeto: " + row);
	}
	public void report(int col) {
		System.out.println(" " + row + col);
	}	
}
