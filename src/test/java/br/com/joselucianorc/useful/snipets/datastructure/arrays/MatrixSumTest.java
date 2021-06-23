package br.com.joselucianorc.useful.snipets.datastructure.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MatrixSumTest {
	
	@Test
	public void testingMatrixSumTest() {
		int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = new int[][] {{9,8,7},{6,5,4},{3,2,1}};
		
		int[][] expected = new int[][] {{10,10,10},{10,10,10},{10,10,10}};
		
		int[][] c = MatrixSum.sum(a,b);
		assertArrayEquals(expected, c);
	}
}
