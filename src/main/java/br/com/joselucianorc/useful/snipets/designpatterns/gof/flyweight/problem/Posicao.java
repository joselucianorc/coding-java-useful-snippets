package br.com.joselucianorc.useful.snipets.designpatterns.gof.flyweight.problem;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Posicao {
	private int num= 0;
	private int row;
	private int col;	
	
	public Posicao(int maxPerRow) {
		row = num / maxPerRow;
		col = num % maxPerRow;
		num++;
		System.out.println("Criado Objeto " + row + col);
	}
	
	public void report() {
		System.out.println(" " + row + col);
	}
}
