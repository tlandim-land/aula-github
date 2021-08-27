package aplicacao;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE QTDE DE LINHAS DA MATRIZ: ");
		int m = sc.nextInt();
		
		System.out.print("DIGITE QTDE DE COLUNA DA MATRIZ: ");
		int n = sc.nextInt();

		// montagem da matriz 
		int[][] mat = new int[m][n];
				
		System.out.println("DIGITE OS NUMEROS DA MATRIZ: ");
		
		for (int l = 0; l < m; l++) {
			for (int c = 0; c < n; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		for(int l = 0; l < m; l++) {
			for(int c = 0; c < n; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}

		System.out.print("DIGITE O NUMERO PARA CONSULTA DA MATRIZ: ");
		int x = sc.nextInt();
		
		for(int l = 0; l < m; l++) {
			for(int c = 0; c < n; c++) {
				if (mat[l][c] == x) {
					
					System.out.print("POSIÇÃO NUMERO : " + l + " " + c);
					System.out.println();

					if (c > 0) {
						System.out.print("NUMERO ESQUERDA : " + mat[l][c - 1]);
						System.out.println();
					}
					
					if (l > 0) {
						System.out.print("NUMERO ACIMA : " + mat[l - 1][c]);
						System.out.println();
					}
					
					if (c < mat[l].length - 1) {
						System.out.print("NUMERO DIREITA : " + mat[l][c + 1]);
						System.out.println();
					}
					
					if (l < mat.length - 1) {
						System.out.print("NUMERO ABAIXO: " + mat[l + 1][c]);
						System.out.println();
					}
				}
			}		
		}
		
		sc.close();

	}

}
