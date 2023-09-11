package Aula4;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
(considere que a idade entre homens e mulheres sempre serão 
diferentes). Calcule e escreva a soma das idades do homem mais velho 
com a mulher mais nova, e o produto das idades 
do homem mais novo com a mulher mais velha.
		 */

		System.out.println("Digite a idade dos 2 homens após das 2 mulheres");
		int homem1 = entrada.nextInt();
		int homem2 = entrada.nextInt();
		int mulher1 = entrada.nextInt();
		int mulher2 = entrada.nextInt();
		
		if(homem1 > homem2 && mulher1 > mulher2) {
			System.out.println(" A soma das idades do homem mais velho com a mulher mais nova é \n"+ (homem1+mulher2)+" e o produto das idades do homem"
					+ "\n mais novo com a mulher mais velha é "+ (homem2*mulher1));
		}else if(homem1>homem2 && mulher1<mulher2) {
			System.out.println(" A soma das idades do homem mais velho com a mulher mais nova é \n"+ (homem1+mulher1)+" e o produto das idades do homem"
					+ "\n mais novo com a mulher mais velha é "+ (homem2*mulher2));
		}else if (homem1<homem2 && mulher1>mulher2) {
			System.out.println(" A soma das idades do homem mais velho com a mulher mais nova é \n"+ (homem2+mulher2)+" e o produto das idades do homem"
					+ "\n mais novo com a mulher mais velha é "+ (homem1*mulher1));
		}else {
			System.out.println(" A soma das idades do homem mais velho com a mulher mais nova é \n"+ (homem2+mulher1)+" e o produto das idades do homem"
					+ "\n mais novo com a mulher mais velha é "+ (homem1*mulher2));
		}
	}

}
