package br.com.joselucianorc.useful.snipets.designpatterns.gof.factorymethod;

public class Designer {
	
	public static void main(String[] args) {
		
		Forma figura = new Retangulo();
/*		
		if (figura instanceof Retangulo) {
			System.out.println("Retângulo selecionado");
			figura.desenhar();
		} else if (figura instanceof Circulo) {
			System.out.println("Círculo selecionado");
			figura.desenhar();			
		}
*/		
		ShapeFactoryImpl formaFactory = ShapeFactoryImpl.getInstance();
		
		Forma forma1 = formaFactory.createRetangulo();
		forma1.desenhar();
		
		Forma forma2 = formaFactory.createCirculo();
		forma2.desenhar();
		
	}
}
