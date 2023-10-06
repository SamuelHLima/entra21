package Aula21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		/*
		 * Faça um algoritmo
		 *  que coloque o número 0 no 
		 *  índice que o usuário escolheu
		 */

		List<Integer> Lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Lista.add(i);
		}
		System.out.println(Lista);
		
		System.out.println("Informe o indice desejado");
		int indice=entrada.nextInt();
		
		Lista.set(indice, 0);
		
		System.out.println(Lista);
		
	}

}
