package Aula13;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 8. Dada a seguinte matriz, calcule: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
		 * 
		 * a) A soma dos elementos de primeira coluna; b) O produto dos elementos da
		 * primeira linha; c) A soma de todos os elementos; d) O produto da diagonal
		 * principal.
		 */

		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int soma = 0;
		int produto = 1;
		int somaTotal = 0;
		int produtoDiagonal = 1;
		// letra a - ok
		// fazer for somente com a linha pois é o que altera
		for (int linha = 0; linha < matriz.length; linha++) {
			soma = soma + matriz[linha][0];
		}

		// letra b - ok matriz acessa linha
		// e verifica quantos elementos
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			produto = produto * matriz[0][coluna];
		}

		// letra c
		// letra d
		for (int linha = 0; linha < matriz.length; linha++) {
			produtoDiagonal = produtoDiagonal * matriz[linha][linha];

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaTotal = somaTotal + matriz[linha][coluna];
			}
		}

		System.out.println("Soma: " + soma);
		System.out.println("Produto: " + produto);
		System.out.println("Soma total: " + somaTotal);
		System.out.println("Produto diagonal: " + produtoDiagonal);

	}

}