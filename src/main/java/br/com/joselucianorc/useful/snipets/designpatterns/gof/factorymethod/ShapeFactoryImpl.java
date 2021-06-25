package br.com.joselucianorc.useful.snipets.designpatterns.gof.factorymethod;

public class ShapeFactoryImpl implements ShapeFactory {
	
	private static ShapeFactoryImpl instance;
	
	public static ShapeFactoryImpl getInstance() {
		if (instance == null) {
			instance = new ShapeFactoryImpl();	
		}
		return instance;		
	}

	@Override
	public Forma createRetangulo() {
		return new Retangulo();
	}

	@Override
	public Forma createCirculo() {
		return new Circulo();
	}	
}
