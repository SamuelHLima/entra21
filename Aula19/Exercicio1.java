package Aula19;

import java.util.Scanner;

public class Exercicio1 {
	
	public static String limites(int limiteMaximo,int limiteMinimo,int numero) {
		String limite=("O numero "+numero+" está nos limites");
		String limite2=("O numero esta fora dos limites");
		
		if (limiteMinimo<=numero && limiteMaximo>=numero) {
			return limite;
		}else {
			return limite2;
		
		}
		
	
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um programa que diz se 
		 * um número inserido está dentro
		 *  de um limite imposto pelo usuário

Por exemplo:

Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.

Depois ele inseriu o número 80.

A saída deve ser: 80 está nos limites impostos.
		 */
	System.out.println("Insira o limite inicial");
	int limiteMinimo=entrada.nextInt();
	
	System.out.println("Insira o limite final");
	int limiteMaximo=entrada.nextInt();
	
	System.out.println("Insira o valor a ser verificado");
	int numero=entrada.nextInt();
			
		System.out.println(limites(limiteMaximo,limiteMinimo, numero));
	
	
	}

}
