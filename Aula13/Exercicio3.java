package Aula13;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a
		 * mesma utilize o Random de java.util.Random, posteriormente imprima esta
		 * matriz;
		 */
		Random aleatorio = new Random();
		int[][] matriz = new int[7][8];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(56);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}

}