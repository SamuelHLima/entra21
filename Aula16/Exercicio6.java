package Aula16;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void triangulo(double base, double altura ) {
		
		System.out.println("O perimetro do triangulo é "+(2*(base+altura)));
		System.out.println("A area do triangulo é "+ (base*altura));
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo

(Passe a altura e a largura como parâmetros da função)
		 */

		System.out.println("Informe a base");
		double base=entrada.nextDouble();
		System.out.println("Informe a altura");
		double altura=entrada.nextDouble();
		triangulo(base, altura);
	}

}
