package br.com.joselucianorc.useful.snipets.designpatterns.gof.prototype.problem;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Circulo {
	private Ponto origem;
	private double raio;
	
	public Circulo(int x, int y, double raio) {
		this.origem = new Ponto(x,y);
		this.raio = raio;
	}
	
	public void show() {
		System.out.println(origem + " raio = " + raio);		
	}	
}
