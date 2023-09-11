package Aula7;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.
		 */
		

		System.out.println("Informe valores: ");
        int entrada = scan.nextInt();
		
		
		
		while(entrada > 1) {
			System.out.println("Informe valores");
			 entrada = scan.nextInt();
		}
		
		System.out.println("fim");

	}

}
