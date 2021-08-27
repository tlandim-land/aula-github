package aplicacao;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE O TAMANHO DA MATRIZ: ");
		int n = sc.nextInt();
		
		// montagem da matriz quadrada
		int[][] mat = new int[n][n];

		for(int l = 0; l < n; l++) {
			for(int c = 0; c < n; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL DA MATRIZ");
		
		for(int l = 0; l < n; l++) {
			for(int c = 0; c < n; c++) {
				if (mat[l] == mat[c]) {
					System.out.println(mat[l][c]);
				}
			}
		}

		System.out.println();
		System.out.println("NUMEROS NEGATIVOS DA MATRIZ");

		for(int l = 0; l < n; l++) {
			for(int c = 0; c < n; c++) {
				if (mat[l][c] < 0) {
					System.out.println(mat[l][c]);
				}
			}
		}
		
		sc.close();
	}

}
