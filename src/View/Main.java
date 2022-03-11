package View;

import java.util.Random;

import Controller.PreencheArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		int[][] mat = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mat[i][j] = rnd.nextInt(10);
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		for(int h = 0; h < 3; h++) {
			PreencheArray preenche = new PreencheArray(mat[h]);
			
			preenche.start();
		}
	}

}
