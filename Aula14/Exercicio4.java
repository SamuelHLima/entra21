package Aula14;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */

		int[] elementos = { 1, 5, 8, 15, 64 };
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		double soma = 0;
		double media = 0;

		for (int i = 0; i < elementos.length; i++) {
			soma += elementos[i];
			media = soma / 5;
			if (elementos[i] < menor) {
				menor = elementos[i];
			}
			if (elementos[i] > maior) {
				maior = elementos[i];
			}
		}
		System.out.println("O maior numero é " + maior);
		System.out.println("O menor numero é " + menor);
		System.out.printf("A media dos valores é %.2f", media);
	}
}
