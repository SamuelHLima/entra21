package Aula14;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Descreva um algoritmo que leia 12 valores decimais e os 
		 * coloque em um vetor de 12 posições. 
Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares 
sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. 

Imprima o vetor resultante
		 */

		double[] vetor=new double[12];
		double valor=0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite 12 valores decimais");
			valor=entrada.nextDouble();
			if (valor%2==0) {
				
				valor=valor+(valor*0.02);
				vetor[i]=valor;
			}else {
				valor=valor+(valor*0.05);
				vetor[i]=valor;
			}
			
		}for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
