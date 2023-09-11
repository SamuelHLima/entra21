package Aula7;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Faça um programa que receba um nome de uma fruta como entrada. 

Faça vários cases para as frutas que você conhece. 

Por exemplo: 

Case "banana": Eu gosto dessa fruta 

Case "pera": Eu não gosto dessa fruta  

Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa fruta e encerre o programa
		 */

		System.out.println("Informe uma fruta");
		String fruta = scan.next();
		while(fruta.equals("banana")||fruta.equals("pera")||fruta.equals("uva")||fruta.equals("morango")) {
		System.out.println("Informe uma fruta");
		fruta = scan.next();
			
		switch (fruta) {
		case "banana":
			System.out.println("Eu gosto dessa fruta");
			break;
		case "pera":
			System.out.println("Eu gosto dessa fruta");
			break;
		case "uva":
		   	System.out.println("Eu gosto dessa fruta");
			break;
			
		case "morango":
			System.out.println("Eu gosto dessa fruta");
			break;
		default:
			break;
		}
		System.out.println("Informe uma fruta 2");
		fruta= scan.next();
		
		}
		System.out.println("Eu não conheço essa fruta");
	}
}	
	



