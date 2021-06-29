package br.com.joselucianorc.useful.snipets.designpatterns.gof.adapter.solution;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.adapter.Shape;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.adapter.problem.Coords;
import br.com.joselucianorc.useful.snipets.designpatterns.gof.adapter.problem.RasterBox;

public class Adapter extends Shape {
	RasterBox rasterBox = new RasterBox();
	
	public int getX() {
		Coords c = rasterBox.getTopLeft();
		return c.getX();
	}
	
	public int getY() {
		Coords c = rasterBox.getTopLeft();
		return c.getY();
	}
	
	public int getHeight() {
		Coords c1 = rasterBox.getTopLeft();
		Coords c2 = rasterBox.getBottomRight();
		return c2.getY() - c1.getY();
	}
	
	public int getWidth() {
		Coords c1 = rasterBox.getTopLeft();
		Coords c2 = rasterBox.getBottomRight();
		return c2.getX() - c1.getX();
	}
	
}
