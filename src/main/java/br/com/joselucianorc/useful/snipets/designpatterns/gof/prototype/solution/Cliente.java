package br.com.joselucianorc.useful.snipets.designpatterns.gof.prototype.solution;

public class Cliente {
	public static void main(String[] args) {
		Circulo circulo = new Circulo( 2, 2, 5);
		circulo.show();
		
		//Nasce com o mesmo estado do original
		Circulo copiaCirculo = (Circulo)circulo.clone();
		copiaCirculo.show();
		
		System.out.println((copiaCirculo == circulo)? "copiaCirculo e circulo são iguais": "copiaCirculo e circulo não são iguais");
		
	}
}
