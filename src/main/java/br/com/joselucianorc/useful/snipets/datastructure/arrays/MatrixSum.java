package br.com.joselucianorc.useful.snipets.datastructure.arrays;

public class MatrixSum {
	
	public static int[][] sum(int[][] a, int[][]b) {
		
		int c[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(String.format("%d ", c[i][j]));
			}
			System.out.print("\n");
		}	
		return c;
	}	
}
