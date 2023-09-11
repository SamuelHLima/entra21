package Aula10;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Faça um algoritmo em que quem preenche os valores do vetor é o usuário,
		 *  por fim printe o vetor (vetor de 5 posições).
		 */
		
		double[] valores=new double [5];
		
		
		double media;
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite 5 elementos");
			valores[i]= teclado.nextDouble();
					
				
			}
		for (int i = 0; i < valores.length; i++) {
				System.out.println(valores[i]);
			}

	}

}
