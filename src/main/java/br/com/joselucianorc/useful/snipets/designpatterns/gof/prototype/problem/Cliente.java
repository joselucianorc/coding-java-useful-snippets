package br.com.joselucianorc.useful.snipets.designpatterns.gof.prototype.problem;

public class Cliente {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(1, 1, 5);
		circulo.show();
		
		//Esse é o modo errado usando a mesma referência
		Circulo copiaCirculo = circulo;		
		System.out.println((circulo == copiaCirculo)?"copiaCirculo e circulo são iguais":"copiaCirculo e circulo não são iguais");
		//Saída será: copiaCirculo e circulo são iguais		
		//Resultado que não queremos
	}
}
