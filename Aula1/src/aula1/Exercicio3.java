package aula1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia dois valores de ponto flutuante e calcule a amedia ponderada sabendo que a nota A tem peso 3,5 e anota b 6,5.
		
		Scanner entrada = new Scanner(System.in);
		double A, B, media;
		final double pesoa = 3.5;
		final double pesob = 6.5;
		
		System.out.println("Digite o valor da nota A?");
		A = entrada.nextDouble();

		System.out.println("Digite o valor da nota B?");
		B = entrada.nextDouble();
		
					
						
		media = (((A*pesoa)+(B*pesob))/(pesoa+pesob));
		
		System.out.printf("O valor da media ponderada é %.2f" , media);

	}

}
