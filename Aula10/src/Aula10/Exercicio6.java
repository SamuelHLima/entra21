package Aula10;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 

Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 

Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela.
		 */
		int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i=0; i< 10;i++) {
            System.out.println("Informe o valor para o primeiro vetor: ");
            vetor1[i] =teclado.nextInt();
            System.out.println("Informe o valor para o segundo vetor: ");
            vetor2[i] =teclado.nextInt();
            soma[i]= vetor1[i]+vetor2[i];

        }
        for (int i=0; i < 10; i++) {
            System.out.println(soma[i]);
        }
        teclado.close();
    }

	}


