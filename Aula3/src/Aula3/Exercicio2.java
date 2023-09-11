package Aula3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça um valor e mostre se ele é par ou impar
		 */
		
		
		Scanner entrada= new Scanner(System.in);
		float parImpar;
		
		
		System.out.println("Digite o valor que queira verificar se é par ou impar?");
		parImpar = entrada.nextFloat();
					
		
		
		if (parImpar % 2 == 0) {
			System.out.println(" O Numero é par");
		} else {
			System.out.println("O numero é impar");

	}

}
}
