package aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Dados dois valores inteiros, escreva um algoritmo que informe se eles 
são múltiplos ou não.
		 */

		Scanner entrada= new Scanner(System.in);
		int a,b;
		double valor;
		
		System.out.println("Digite o primeiro valor?");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo valor?");
		b = entrada.nextInt();
		
		
		
		if (a % b == 0) {
			System.out.println(" Os numeros são multiplos");
		} else {
			System.out.println("Os numeros não são multiplos ");

		}
	}
}


