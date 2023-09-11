package Prova;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Escreva um programa onde o usúario informa os dados dos lados de um
		 * triangulo depois verifique e retorne se ele é isoscele, escaleno
		 * ou equilátero.
		 */
		
		System.out.println("Informe os dados de um triangulo");
		int ladoUm=entrada.nextInt();
		int ladoDois=entrada.nextInt();
		int ladoTres=entrada.nextInt();
		
		if(ladoUm== ladoDois && ladoDois== ladoTres) {
		System.out.println("Equilátero");
		}else if( ladoUm == ladoDois || ladoDois==ladoTres||ladoTres==ladoUm) {
			System.out.println("isóleces");
		}else {
			System.out.println("Escaleno");
		}

	}

}
