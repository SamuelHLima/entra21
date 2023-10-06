package Aula21;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Descreva um algoritmo que leia 6 valores reais
		 *  e os coloque em uma Array List.
Imprima quais valores desses informados são maiores que a média dos valores.
		 */

		
		
ArrayList<Integer> lista = new ArrayList<>();

		
		lista.add(1);//0
		lista.add(2);//1
		lista.add(3);//2
		lista.add(4);//3
		lista.add(5);//4
		lista.add(6);//5
		int soma=0;
		double media=0;
		
		for (int i = 0; i < lista.size(); i++) {
			soma+=lista.size();
			media=soma/6;
			if (lista.size() < media) {
				
			}
		}
	}

}
