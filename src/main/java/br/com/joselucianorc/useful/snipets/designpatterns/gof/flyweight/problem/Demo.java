package br.com.joselucianorc.useful.snipets.designpatterns.gof.flyweight.problem;

public class Demo {
	public static final int ROWS = 6, COLS = 10;
	
	public static void main(String[] args) {
		Posicao[][] matrix = new Posicao[ROWS][COLS];
		
		for (int i = 0; i< ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				//matrix[i][j] = new Posicao(COLS);
				matrix[i][j] = new Posicao(15, i, j);
			}
		}
		
		for (int i = 0; i< ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				matrix[i][j].report();
				System.out.println();
			}
		}
	}
}
