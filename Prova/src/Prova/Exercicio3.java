package Prova;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e depois calcule a 
média.
		 */
		
		
		int valor=0;
				
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite a altura de 10 pessoas em centimetros");
			int altura=entrada.nextInt();
			valor += altura;
			
		}
		double media =(valor/10);
		System.out.println("A media de altura é "+ media);

	}

}
