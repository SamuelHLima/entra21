package aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// scanner - entrada de dados que o usuario coloca
		//Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
		
		
		Scanner entrada = new Scanner(System.in);
		double raio, circunferencia;
		
		System.out.println("Digite o valor do raio?");
		raio = entrada.nextDouble();
						
		circunferencia = Math.pow(raio, 2) * Math.PI;
		
		System.out.printf("O valor da circunferencia é %f" , circunferencia);
		
		
		

	}

}
