package Aula13;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Crie um programa onde o usuário define quantas linhas e colunas deve ter uma
		 * matriz, e posteriormente imprima o total de elementos(posições) que está
		 * matriz tem
		 */

		System.out.println("Informar a quantidade de linhas da matriz");
		int linhas = teclado.nextInt();

		System.out.println("Informar a quantidade de Colunas da matriz");
		int colunas = teclado.nextInt();

		int[][] matriz = new int[linhas][colunas];
		int soma = 0;
		soma = linhas * colunas;
		System.out.println("A quantidade de posições dessa matriz é " + soma);

	}

}