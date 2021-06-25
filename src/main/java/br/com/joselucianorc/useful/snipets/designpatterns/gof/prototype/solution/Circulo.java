package br.com.joselucianorc.useful.snipets.designpatterns.gof.prototype.solution;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Circulo implements Cloneable {
	private Ponto origem;
	private double raio;
	
	public Circulo(int x, int y, double raio) {
		this.origem = new Ponto(x,y);
		this.raio = raio;
	}

	@Override
	protected Object clone() {
		try {
			Circulo circulo = (Circulo)super.clone();
			circulo.origem = (Ponto)origem.clone();
			return circulo;
		} catch( CloneNotSupportedException ex ) {
			return null;
		}
	}	
	
	public void show() {
		System.out.println(origem + " raio = " + raio);		
	}
}
