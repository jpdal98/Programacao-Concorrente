package MultiplicacaoMatriz;

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		// Numero predefinido de lihas e colunas nas duas matrizes
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas da matrizA");
		int linha = sc.nextInt();
		System.out.println("Digite a quantidade de colunas da matrizA");
		int coluna = sc.nextInt();
		int[][] matrizA = new int[linha][coluna];

		System.out.println("Digite a quantidade de linhas da matrizB");
		int linha2 = sc.nextInt();
		System.out.println("Digite a quantidade de colunas da matrizB");
		int coluna2 = sc.nextInt();
		int[][] matrizB = new int[linha2][coluna2];
//		Numero predefinido de lihas e colunas nas duas matrizes
		
		
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.println("Digite os valores da matrizA");
				int entrada = sc.nextInt();
				matrizA[i][j] = entrada;

			}

		}
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.println(matrizA[i][j] + "");

			}

		}
		System.out.println("");

		for (int i = 0; i < linha2; i++) {
			for (int j = 0; j < coluna2; j++) {
				System.out.println("Digite os valores da matrizB");
				int entrada = sc.nextInt();
				matrizB[i][j] = entrada;
			}

		}
		for (int i = 0; i < linha2; i++) {
			for (int j = 0; j < coluna2; j++) {
				System.out.println(matrizB[i][j] + "");

			}

		}
		System.out.println("");
// Multiplicação
		
		int[][] matrizResultante = new int[linha][coluna2];
		long inicio = System.nanoTime();
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna2; j++) {
				for (int k = 0; k < linha2; k++) {
					matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}

		}
		long fim = System.nanoTime();
		System.out.println("TEMPO DECORRIDO: "+(fim-inicio)+" nano s" );
//		Mostrando o resultado
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna2; j++) {
				System.out.println(matrizResultante[i][j]);
			}

		}

	}
}
