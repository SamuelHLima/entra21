package Aula13;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores
		 * utilizando o scanner, ao fim imprima a matriz
		 */

		int[][] matriz = new int[3][3];

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("informe os valores para uma matriz 3x3, sendo assim 9 elementos ");
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("matriz [" + linha + "][" + coluna + "] = " + matriz[linha][coluna]);

			}

		}
	}
}