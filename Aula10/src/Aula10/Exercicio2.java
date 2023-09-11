package Aula10;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		/*
		 *Crie um array de 10 elementos e depois peça ao usuário para informar um índice,
		 * imprima o o valor que está no vetor conforme indice informado pelo usuario
		 */

		
		int[] elementos = {1, 2, 3, 4, 5,6,7,8,9,10};
		System.out.println("Escolha o Indice ");
		int indice=entrada.nextInt();
		System.out.println(elementos[indice]);
		
		
		
		
	}
	
}
