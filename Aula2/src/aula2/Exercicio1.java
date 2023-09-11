package aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Dados dois números inteiros descreva um algoritmo para informar o 
maior valor entre eles.
		 */

		Scanner entrada= new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite o primeiro valor?");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo valor?");
		b = entrada.nextInt();
		
		if (a>b) {  
			
			System.out.println(" A é maior que B");
		} else {
			System.out.println(" B é maior que A");

		}
		
	}

}
