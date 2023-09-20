package Aula11;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Faça um algoritmo que inverta a ordem de uma array
(o primeiro elemento vai se tornar o último elemento)
		 */
		
		int[] vetor_original = { 1, 2, 3, 4, 5 };
		int[] vetor_copia = new int[vetor_original.length];
		int VetorBaseZero = vetor_original.length - 1;
		for(int i = 0; i < vetor_original.length; i++) {
		    vetor_copia[i] = vetor_original[VetorBaseZero - i];
		    System.out.print(vetor_copia[i]);
		}
		
	}

}