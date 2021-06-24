package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.planta;

import lombok.Data;

@Data
public abstract class Jardim {
	
	private String nome;
	
	public abstract Planta getCentro();	
	public abstract Planta getBorda();	
	public abstract Planta getSombra();
}
