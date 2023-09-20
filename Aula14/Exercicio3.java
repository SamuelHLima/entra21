package Aula14;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar
		 * com o número 0
		 * 
		 * a) Qual é o menor valor?
		 * 
		 * b) Qual é o maior valor?
		 * 
		 * c) Qual é a média dos valores?
		 */

		int valor = Integer.MIN_VALUE;
		int valor1=Integer.MIN_VALUE;
		int media = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		int contador=0;

		while (valor != 0) {
			System.out.println("informe um valor");
			valor1 = entrada.nextInt();
			contador++;
			soma += valor1;
			
			if (valor1 < menor) {
				menor = valor1;
			}
			if (valor1 > maior) {
				maior = valor1;
			}
			
			System.out.println("digite 0 para sair");
			valor=entrada.nextInt();
		}media=soma/contador;
		System.out.println("O menor valor é " + menor);
		System.out.println("O maior valor é "+ maior);
		System.out.println("A media dos valores "+ media);

	}

}
