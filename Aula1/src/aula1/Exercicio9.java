package aula1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*Escreva um programa que leia três valores com ponto flutuante de dupla
precisão: A, B e C.
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */
		
		Scanner entrada = new Scanner(System.in);

		float a, b,c,triangulo, circulo,trapezio,quadrado,retangulo;

		System.out.println("Digite o valor de A");
		a = entrada.nextFloat();
		System.out.println("Digite o valor de B");
		b = entrada.nextFloat();
		System.out.println("Digite o valor de C");
		c = entrada.nextFloat();
		
		triangulo=(a*c)/2;
		circulo= (float) ((3.14) * (c*c));
		trapezio = (a+b)/(c/2);
		quadrado = b*b;
		retangulo = a*b;

		System.out.printf("A area do triangulo é %.2f\n", triangulo);
		System.out.printf("A area do circulo é %.2f\n", circulo);
		System.out.printf("A area do trapezio é %.2f\n", trapezio);
		System.out.printf("A area do quadrado é %.2f\n", quadrado);
		System.out.printf("A area do retangulo é %.2f\n", retangulo);

	}

}
