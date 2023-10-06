package Aula19;

import java.util.Scanner;

public class Exercicio2 {

	public static String cubo(int valor1, int valor2) {
	
		
		if (valor1 == 5 || valor2 == 5) {
			return (Math.pow(valor1, 3)) + " " + (Math.pow(valor2, 3));
		} else if ((valor1+valor2 == 5) || (valor2+valor1 == 5)) {
			return (Math.pow(valor1, 3)) + " " + (Math.pow(valor2, 3));
		} else if ((valor1-valor2 == 5) || (valor2-valor1 == 5)) {
			return (Math.pow(valor1, 3)) + " " + (Math.pow(valor2, 3));
		} else {
			return (Math.pow(valor1, 2)) + " " + (Math.pow(valor2, 2));
		}

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um código que receba duas entradas do usuário
		 * 
		 * Printe cada entrada ao cubo se: Algum dos dois números for 5 A soma deles é 5
		 * A diferença deles é 5
		 * 
		 * Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
		 * quadrado
		 */

		System.out.println("Informe o primeiro numero");
		int valor1=entrada.nextInt();
		System.out.println("Informe o primeiro numero");
		int valor2=entrada.nextInt();
		
		System.out.println(cubo(valor1, valor2));
	}

}
