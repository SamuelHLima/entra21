package Aula13;

import java.util.Random;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando Randon
		 * e depois:
		 * 
		 * a) Informe quantas vezes a matriz repete o número 0;
		 * 
		 * b) A quantidade de números pares;
		 * 
		 * c) A quantidade de números ímpares
		 */

		int[][] matriz = new int[3][5];
		Random aleatorio = new Random();
		int pares = 0;
		int impar = 0;
		int zero = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(15);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] >= 0) {
					if (matriz[i][j] % 2 == 0) {
						pares++;
					}
					if (matriz[i][j] % 2 != 0) {
						impar++;
					}
					if (matriz[i][j] == 0) {
						zero++;
					}
				}
				System.out.println(matriz[i][j]);
			}
		}
		System.out.println("a quantidade de numeros zero é " + zero);
		System.out.println("a quantidade de numeros pares é " + pares);
		System.out.println("a quantidade de numeros impares é " + impar);

	}
}