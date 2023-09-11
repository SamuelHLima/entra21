package Aula9;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um algoritmo que atribua valores ao vetor de acordo
		 *  com o quadrado do seu índice e printe o vetor. 
		 
Ex: 

[0] = 0 

[1] = 1 

[2] = 4 

[3] = 9
		 */
//indice == posicao (vetor[0],vetor[1]...)
//tipo[] nome =new tipo[tamanho do vetor];
		int tamanhoVetor=10;
		int[] vetor =new int[tamanhoVetor];
		//System.out.println(vetor[0]);- imprimindo o valor de uma variavel
	for (int indice = 0; indice < 10; indice++) {
		vetor[indice] = indice * indice;
	}
	
	for (int indice = 0; indice < 10; indice++) {
		System.out.println(vetor[indice]);
	}
	}

}
