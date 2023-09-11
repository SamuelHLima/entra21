package Aula10;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 

Imprima quais valores desses informados são maiores que a média dos valores.
		 */
package controle_candidatos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 

Imprima quais valores desses informados são maiores que a média dos valores.
		 */
		
		double[] valores=new double [12];
		double valor=0;
		
		double media;
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite 12 elementos");
			valores[i]= teclado.nextDouble();
			valor += valores[i];
			
				
			}
			media = valor/12;
			for (int i = 0; i < valores.length; i++) {
				
			if (valores[i]>media) {
				System.out.println(valores[i]);
			}
		
		 
	
		
		
	}
	}
}
	}

}
