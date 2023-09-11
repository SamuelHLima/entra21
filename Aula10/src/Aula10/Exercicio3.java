package Aula10;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 *  Crie um array de elementos e depois peça ao usuário para informar um valor,
		 *   verifique se este valor está presente no array e printe o índice.
		 */

		int[] vetor =new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor");
		vetor[i]=entrada.nextInt();
		}
		System.out.println("Inform um valor para ver se esta presente");
		int variavelAuxiliar=entrada.nextInt();
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]==variavelAuxiliar) {
				System.out.println("indice: "+i);
		}
		
		
	}

}
}