package aula1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela
		 * entregou um valor em dólares para o atendente. Calcule quantos reais o
		 * atendente deve devolver para a pessoa
		 */

		Scanner entrada = new Scanner(System.in);

		double dolares, reais;

		System.out.println("Qual o valor em dolares que voce quer trocar?");
		dolares = entrada.nextDouble();

		reais = dolares * 5;

		System.out.printf("O seu valor convertido em reais é de R$ %.2f", reais);

	}

}
