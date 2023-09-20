package Aula16;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void numeros() {
		Scanner entrada = new Scanner(System.in);
		double numero=0;
		 double numero1=0;
		System.out.println("Informe o primeiro numero");
		numero=entrada.nextDouble();
		System.out.println("Informe o segundo numero");
		numero1=entrada.nextDouble();
		
		if (numero>numero1) {
			System.out.println("O "+numero+" é maior que o numero "+numero1);
		}else if (numero1>numero) {
			System.out.println("O "+numero1+" é maior que o numero "+numero);
		}else {
			System.out.println("Os numeros são iguais");
		}
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 2 números do usuário.
Faça um método que descubra qual dos números é maior
Se os dois números forem iguais, informe: número iguais
		 */
numeros();
		
		
	}

}
