package Aula12;

import java.util.Iterator;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
		 * Posteriormente verifique a média e imprima somente os valores que estão acima dela
		 */
int[][] matriz=new int[5][1];
		
		matriz[0][0]=1;
		matriz[1][0]=2;
		matriz[2][0]=3;
		matriz[3][0]=4;
		matriz[4][0]=5;
		
		double soma=0;
		double media=0;
		int pares=0;
		int impar=0;
		
	for (int i = 0; i < matriz.length; i++) {
		
		for (int j = 0; j < matriz[i].length; j++) {
			soma+=matriz[i][j];	
			media=soma/matriz[i][j];
			//System.out.println(matriz[i][j]); 
			
				
				
		}
	
	
	}

	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
		
		if ((matriz[i][j])>media) {
			System.out.println(matriz[i][j]);
	}
	
}
	
	}System.out.println(soma);
	System.out.println(media);	
}
}




	


