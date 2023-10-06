package Aula21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		/*
		 * Faça um algoritmo em que o usuário insere 
		 * um número em um índice específico que ele mesmo informou

		 */

		
		List<Integer> Lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Lista.add(i);
		}
		System.out.println(Lista);
		
		System.out.println("Informe o indice desejado");
		int indice=entrada.nextInt();
		System.out.println("Informe o valor que desejado");
		int valor=entrada.nextInt();
		
		Lista.set(indice, valor);
		
		System.out.println(Lista);
		
	}

}
