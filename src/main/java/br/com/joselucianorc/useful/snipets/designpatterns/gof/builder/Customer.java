package br.com.joselucianorc.useful.snipets.designpatterns.gof.builder;

public class Customer {
	public static void main(String[] args) {		
		Contractor contractor = new Contractor();	
		
		contractor.seleciona('h');
		contractor.build();
		
		contractor.seleciona('b');
		contractor.build();				
	}
}
