package Aula12;

public class Exemplo {

	public static void main(String[] args) {
		/*
		 * Percorrer a matriz
		 */

		int[][] matriz=new int [2][4];
		
		matriz[0][0]=10;
		matriz[0][1]=20;
		matriz[0][2]=30;
		matriz[0][3]=40;
		
		int soma=0;
		
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println(matriz[0][coluna]);
			soma= soma+ matriz[0][coluna];
		}System.out.println(soma);
	
	}

}
