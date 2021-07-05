package br.com.joselucianorc.useful.snipets.designpatterns.gof.flyweight.solution;

public class Usage {
	public static final int ROWS = 6;
	public static final int COLS = 10;
	
	public static void main(String[] args) {
		Flyweight fabrica = new Flyweight(ROWS);
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				fabrica.getFlyweight(i).report(j);
				System.out.println();
			}
		}
	}
	
}
