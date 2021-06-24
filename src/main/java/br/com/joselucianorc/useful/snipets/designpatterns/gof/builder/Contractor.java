package br.com.joselucianorc.useful.snipets.designpatterns.gof.builder;

public class Contractor {
	private Builder constructor;
	
	public void seleciona(char tipo) {
		switch(tipo) {
			case 'h': constructor = new HomeConstructor(); break;
			case 'b': constructor = new BuildingConstructor(); break;		
		}		
	}
	
	public void build() {
		System.out.println(constructor.buildPartOne());
		System.out.println(constructor.buildPartTwo());
	}
}
