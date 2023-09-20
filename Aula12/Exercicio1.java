package Aula12;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Criar uma matriz com 1 linha e 10 colunas, 
		 * na mesma verifique quantos valores são par e quantos valores são impar e calcule a média dos valores
		 * 
		 */

		int[][] matriz=new int[1][10];
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		matriz[0][3]=4;
		matriz[0][4]=5;
		matriz[0][5]=6;
		matriz[0][6]=25;
		matriz[0][7]=20;
		matriz[0][8]=30;
		matriz[0][9]=10;
		
		int soma=0;
		double media=0;
		int pares=0;
		int impar=0;
		
	for (int coluna = 0; coluna < matriz[0].length; coluna++) {
		soma+= matriz[0][coluna];
		if (matriz[0][coluna]>=0) {
			if (matriz[0][coluna ]%2==0) {
				pares++;
			}else {
				impar++;
			}
		}
		
	}media=soma/matriz[0].length;
	System.out.println(media);
	System.out.println(pares);
	System.out.println(impar);
		
	}

}
