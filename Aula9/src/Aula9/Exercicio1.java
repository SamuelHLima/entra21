package Aula9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Crie um programa que solicite 3 notas e 
		 * armazene em um vetor, depois imprima a media
		 */
		
		double soma=0;
		
		double[] notas=new double [3];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite as notas ");
			notas[i]=entrada.nextDouble();
		
			soma =soma + notas[i];
			
			
		}
		
		System.out.println("A media é "+ (soma/3));
	}

}
