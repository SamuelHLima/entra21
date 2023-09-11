package Aula10;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e por fim printe o vetor.
		 */
		
		int[] vetor= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Escolha um indice");
	int indice=entrada.nextInt();
	vetor[indice]=0;
	for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);
	}
	}

}
