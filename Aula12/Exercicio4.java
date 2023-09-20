package Aula12;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz 3 linhas e 3 colunas, preencha a mesma de A até I, posteriormente imprima a matriz.
		 */
	       
char[][] matriz = {
		{'A','B','C'},
		{'D','E','F'},
        {'G','H','I'}
		};


		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna]+" ");
	
			}System.out.println();
		}

	}

}

