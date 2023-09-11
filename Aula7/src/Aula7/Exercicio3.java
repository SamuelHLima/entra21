package Aula7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Faça um programa que peça ao usuário um número entre 12 e 20. 
		 * Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente.
		 *  Se digitar correto mostrar o número digitado.
		 */
		
		int numero;
	       

        System.out.println("Informe um numero entre 12 a 20: ");
        numero = scan.nextInt();

        while (numero<12 || numero >20) {
            System.out.println("Entrada invalida ");
        numero = scan.nextInt();
	}
        System.out.println(numero);
	}
}
