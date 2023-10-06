package Aula21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array
		 * List. Em seguida, modifique a Array List de modo que os valores das POSIÇÕES
		 * ímpares sejam aumentados em 5% e os das POSIÇÕES pares sejam aumentados em
		 * 2%. Imprima a Array List resultante
		 */

		List<Double> Lista = new ArrayList<>();

		System.out.println("Insira 5 valores");
		double valor = 0;

		for (int i = 0; i < 5; i++) {
			valor = entrada.nextDouble();

			if (i % 2 == 0) {
				valor = valor + (valor * 0.02);
				Lista.add(valor);
			} else {
				valor = valor + (valor * 0.05);
				Lista.add(valor);
			}
		}
		for (int i = 0; i < Lista.size(); i++) {
			System.out.println("[" + i + "] = " + Lista.get(i));
		}

	}
}
