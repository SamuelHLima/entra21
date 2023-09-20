package Aula13;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * 6. Crie um programa onde o usuário define quantas linhas e colunas deve ter
		 * uma matriz, e posteriormente imprima o total de elementos(posições) que está
		 * matriz tem
		 */

		System.out.println("Informe a quantidade de linhas");
		int linha = entrada.nextInt();
		System.out.println("Informe a quantidade de colunas");
		int coluna = entrada.nextInt();

		boolean[][] matriz = new boolean[linha][coluna];

		System.out.println("A quantidade de elementos: " + (matriz.length * matriz[0].length));

	}

}