package br.com.joselucianorc.useful.snipets.designpatterns.gof.flyweight.solution;

public class Flyweight {
	private Posicao[] pool;

	public Flyweight(int total) {
		this.pool = new Posicao[total];
	}
	
	public Posicao getFlyweight(int row) {
		if (pool[row] == null) {
			pool[row] = new Posicao(row);
		}
		return pool[row];
	}
}
