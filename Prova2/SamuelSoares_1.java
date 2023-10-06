package Prova2;

import java.util.Scanner;

public class SamuelSoares_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Crie um programa para encontrar o maior número que pode ser criado reordenando o vetor.
Por exemplo:
{1, 2, 3, 0, 4, 6}
Deverá ter a saída: 643210
Proibido usar: Arrays.sort()
É o vetor não possui números negativos
		 */

		int[] numero = new int [6];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Insira o valor no vetor");
			numero[i]=entrada.nextInt();
		}
		String resultado="";
		
		for (int i = 0; i < numero.length; i++) {
			int maiorValor=Integer.MIN_VALUE;
			int indiceMaior=0;
			for (int j = 0; j < numero.length; j++) {
				if (numero[j]>maiorValor) {
					maiorValor=numero[j];
					indiceMaior=j;
				}
			}
			resultado+=maiorValor+" ";
			numero[indiceMaior]=-1;
		}
		System.out.println(resultado);
	}

}
