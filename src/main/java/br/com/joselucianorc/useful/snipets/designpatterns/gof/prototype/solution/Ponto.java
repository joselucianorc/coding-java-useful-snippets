package br.com.joselucianorc.useful.snipets.designpatterns.gof.prototype.solution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ponto implements Cloneable {
	private int coordenadaX;
	private int coordenadaY;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
}
