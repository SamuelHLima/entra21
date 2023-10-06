package Aula17;

import java.util.Scanner;

public class Exercicio1 {
	public static void palavra(String palavras) {
		
			if (palavras.length()%2==0) {
				System.out.println(palavras.charAt(0));
			}else {
				System.out.println(palavras.charAt(1));
			}
		}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um código que recebe uma palavra do usuário, 
		 * se essa palavra tem tamanho par, printe o primeiro caracter 
		 * dessa palavra
Caso ela tenha tamanho ímpar, printe o segundo caracter dessa palavra
		 */
System.out.println("Informe a palavra desejada");
String palavras=entrada.next();
palavra(palavras);
		
	}

}
