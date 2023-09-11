package Aula10;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
	
		/*
		 * Crie uma array de 5 elementos e descubra: 

a) Qual o maior elemento 

b) Qual o menor elemento 

c) A média dos elementos
		 */

		double[] valores=new double [5];
		double valor=0;
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite 5 elementos");
			valores[i]= entrada.nextDouble();
			valor += valores[i];
			
			if(valores[i] > maior) {
				maior=valores[i];
			}else if (valores[i]<menor) {	
			menor=valores[i];		
		
	}
		
		
		
		}
		double media =(valor/5);
		System.out.println("A media dos valores é "+ media);
		System.out.println("O menor valor é :"+ menor);
		System.out.println("O maior valor é :" + maior);
	
	}
}




