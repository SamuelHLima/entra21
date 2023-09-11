package aula2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que imprima "nome correto" caso o nome inserido 
seja o seu
		 */

		Scanner entrada= new Scanner(System.in);
		String nome;
    		
		System.out.println("Informe seu nome?");
		nome = entrada.next();
		
		
		if (nome.equals("Samuel")) {
			System.out.println(" Nome correto");
		} else {
			System.out.println("Nome incorreto ");

		}
	}

	}


