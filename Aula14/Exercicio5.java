package Aula14;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		 * seu índice
		 * 
		 * Ex:
		 * 
		 * [0] = 0
		 * 
		 * [1] = 1
		 * 
		 * [2] = 4
		 * 
		 * [3] = 9.
		 */

		int tamanhoVetor = 20;
		int[] vetor = new int[tamanhoVetor];

		for (int indice = 0; indice < 20; indice++) {
			vetor[indice] = indice * indice;
		}

		for (int indice = 0; indice < 20; indice++) {
			System.out.println(vetor[indice]);
		}

	}

}
