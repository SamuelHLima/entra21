package Aula21;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um algoritmo que remova o valor do meio da ArrayList. Caso a array list
		 * tenha tamanho par, remova o valor da segunda metade. Por exemplo: Em uma
		 * ArrayList de tamanho 6, remova o valor no índice 4
		 */

		ArrayList<Integer> lista = new ArrayList<>();

		
		lista.add(1);//0
		lista.add(2);//1
		lista.add(3);//2
		lista.add(4);//3
		lista.add(5);//4
		lista.add(6);//5
	

		
		if (!lista.isEmpty()) {
			int tamanho = lista.size();

			
			if (tamanho % 2 == 0) {
				int indice = (tamanho / 2) ; 
				lista.remove(indice);
			} else {
				int indice = tamanho / 2; 
				lista.remove(indice);
			}

			
			System.out.println("ArrayList após a remoção: " + lista);
		} else {
			System.out.println("A ArrayList está vazia.");
		}
	}

}
