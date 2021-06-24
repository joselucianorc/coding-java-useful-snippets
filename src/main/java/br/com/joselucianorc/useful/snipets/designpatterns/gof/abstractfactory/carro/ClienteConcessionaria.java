package br.com.joselucianorc.useful.snipets.designpatterns.gof.abstractfactory.carro;

public class ClienteConcessionaria {
	public static void main(String[] args) {
		byte tipo = Byte.parseByte(args[0]);
		Montadora montadora;
		switch(tipo) {
			case 1: montadora = new Honda(); break;
			case 2: montadora = new Chevrolet(); break;
			default: montadora = new Fiat();
		}
		
		System.out.println(montadora.getNome());
		System.out.println("Automóvel:" + montadora.getAutomovel().getName());
		System.out.println("SUV:" + montadora.getSUV().getName());
		System.out.println("Picape:" + montadora.getPicape().getName());
	}
}
