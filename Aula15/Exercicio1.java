package Aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
		 * metros e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
		 * imprima quantos anos serão necessários para que Zé seja maior que Chico.
		 */

		int ano = 0;
		double chico = 1.50;
		double cresceChico = 0;
		double Ze = 1.10;
		double cresceZe = 0;

		while (chico >= Ze) {
			cresceChico = +0.02;
			cresceZe = +0.03;
			ano++;
		}
		System.out.println(ano);

	}

}
