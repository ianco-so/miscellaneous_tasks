package tarefa10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class matriz {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\ianco\\eclipse-workspace\\curso_programacao\\src\\tarefa10\\numbers.txt");
		Scanner sc;
		try { sc = new Scanner(file);} catch (FileNotFoundException e) { sc = null;}
		int n = sc.nextInt(), m = sc.nextInt();
		
		int [][] matrix = new int [n][m];
		for(int i = 0;i < matrix.length; i++) for (int j = 0;j < matrix[i].length; j++) {
			matrix[i][j] = sc.nextInt();
		}
		
		int referenceValue = sc.nextInt();
		matrixAnalysis(matrix, referenceValue);
		
		sc.close();
	}
	
	private static void matrixAnalysis (int matrix[][], int referenceValue) {
		for(int i = 0;i < matrix.length; i++) for (int j = 0;j < matrix[i].length; j++) {
			if (matrix[i][j] == referenceValue) {
				System.out.println("Position "+i+","+j+":");
				if (i > 0) System.out.println("Up: "+matrix[i-1][j]);
				if (i+1 < matrix.length) System.out.println("Down: "+matrix[i+1][j]);
				if (j > 0) System.out.println("Left: "+matrix[i][j-1]);
				if (j+1 < matrix[i].length) System.out.println("Right: "+matrix[i][j+1]);
			}
		}
	}
	
}