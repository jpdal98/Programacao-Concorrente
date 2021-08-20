package MultiplicacaoMatriz;

public class Trabalhador extends Thread {
	private int[][] matrizResultante, matrizA, matrizB;
	private int i,j, k;
	
	
	public Trabalhador(int[][] matrizResultante, int[][] matrizA, int[][] matrizB, int i, int j, int k) {
		
		this.matrizResultante = matrizResultante;
		this.matrizA = matrizA;
		this.matrizB = matrizB;
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public void multiplicar() {
		matrizResultante[i][j] += matrizA[i][k] * matrizB[k][j];
//		System.out.println(matrizA[i][k] * matrizB[k][j]);
	}
	
	@Override
	public void run() {
		this.multiplicar();
	}
}
