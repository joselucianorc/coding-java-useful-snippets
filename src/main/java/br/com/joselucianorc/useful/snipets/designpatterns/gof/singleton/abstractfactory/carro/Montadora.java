package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton.abstractfactory.carro;

import lombok.Data;

@Data
public abstract class Montadora {
	
	private String nome;
	
	public abstract Carro getAutomovel();	
	public abstract Carro getSUV();	
	public abstract Carro getPicape();
}
