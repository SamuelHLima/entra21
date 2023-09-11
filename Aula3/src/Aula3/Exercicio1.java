package Aula3;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça um valor e mostre na tela se o valor é 
positivo ou negativo
		 */

		Scanner entrada = new Scanner(System.in);
		float a;

		System.out.println("Digite o valor que queira verificar");
		a = entrada.nextFloat();

		
		if (a > 0) {

			System.out.println(" O numero é positivo");
		}
		else {

			System.out.println("O numero é negativo");

		}
		
	}
	}


