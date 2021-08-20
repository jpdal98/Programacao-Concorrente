package MultiplicacaoMatriz;

import java.util.Random;
import java.util.Scanner;

public class Matrizes2 {
	public static void main(String[] args) {
		int nlinhas = 3, ncolunas = 3;
		Scanner sc = new Scanner(System.in);
		int[][] matrizA = new int [nlinhas] [ncolunas];
		int[][] matrizB = new int [nlinhas] [ncolunas];
		Random r = new Random();
		
//		for (int i = 0; i < nlinhas; i++) {
//			for (int j = 0; j < ncolunas; j++) {
//				System.out.println("Digite os valores da matrizA");
//				int entrada = sc.nextInt();
//				matrizA[i][j] = entrada;
//
//			}
//
//		}
//		showMatriz(matrizA, nlinhas, ncolunas);
//		
//		for (int i = 0; i < nlinhas; i++) {
//			for (int j = 0; j < ncolunas; j++) {
//				System.out.println("Digite os valores da matrizB");
//				int entrada = sc.nextInt();
//				matrizB[i][j] = entrada;
//			}
//
//
//		}
//		showMatriz(matrizB, nlinhas, ncolunas);

		for (int i = 0; i < nlinhas; i++) {
			for (int j = 0; j < ncolunas; j++) {
				matrizA[i][j] = r.nextInt(10);
				matrizB[i][j] = r.nextInt(10);
			}
		}
		System.out.println("MatrizA");
		showMatriz(matrizA, nlinhas, ncolunas);
		System.out.println("MatrizB");
		showMatriz(matrizB, nlinhas, ncolunas);
		
		
//		Trabalhador t = new Trabalhador(matrizB, valor, ncoluna, nlinhas);
		
		int[][] matrizResultante = new int[nlinhas][ncolunas];
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < nlinhas; i++) {
			for (int j = 0; j < ncolunas; j++) {
				for (int k = 0; k < nlinhas; k++) {
					Trabalhador t = new Trabalhador(matrizResultante, matrizA, matrizB, i, j, k);
					t.start();
					try {
						t.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		long fim = System.currentTimeMillis();
		System.out.println("TEMPO DECORRIDO: "+(fim-inicio)+" ms" );
		System.out.println("Matriz Resultante");
		showMatriz(matrizResultante, nlinhas, ncolunas);
		
	}
	
	static void showMatriz(int [][] matriz, int nlinhas, int ncolunas) {
		for (int i = 0; i < nlinhas; i++) {
			for (int j = 0; j < ncolunas; j++) {
				System.out.print(" " + matriz[i][j]);
				if (j == (ncolunas - 1)) {
					System.out.println();
				}
			}
		}
	}
}
