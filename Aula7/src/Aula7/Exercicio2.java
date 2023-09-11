package Aula7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.
		 */

int entrada=1;
int soma=0;
		
		
		while(entrada != 0) {
			System.out.println("Informe valores");
			entrada = scan.nextInt();
			soma +=entrada;
		}
		System.out.println(soma);
		System.out.println("fim");

	}


	}


