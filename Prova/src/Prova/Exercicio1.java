package Prova;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Escreva um programa onde o usuário informa um valor e a opção desejada do que deve ser 
feito com o valor, sendo as opções 1-converter de dólar para real e 2-converter de real para dólar, 
qualquer outra opção é considerada entrada inválida.
		 */
		
		double valor=0;
		int opcao;
		
		System.out.println("Digite o valor desejado para conversão");
		valor =entrada.nextDouble();
		
		System.out.println("Digite a opção desejada sendo 1 para converter de dólar para real e 2 de real para dólar");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.printf("O valor em reais é %.2f", (valor* 4.97));
		break;
		case 2:
			System.out.printf("O valor em dolar é %.2f", (valor/ 4.97));
		break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		

	}

}
