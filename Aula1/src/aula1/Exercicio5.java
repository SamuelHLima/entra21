package aula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// leia quatro valores inteiros A, B,C e D. A seguir , calcule a e mostre a diferença do produto de A e B pelo produto C e D.
		
		Scanner entrada = new Scanner(System.in);
		double A,B,C,D, diferença,produtoa, produtob;
		
		System.out.println("Digite o valor de A?");
		A = entrada.nextDouble();
		
		System.out.println("Digite o valor de B?");
		B = entrada.nextDouble();
		
		System.out.println("Digite o valor de C?");
		C = entrada.nextDouble();
		
		System.out.println("Digite o valor de D?");
		D = entrada.nextDouble();
						
		produtoa = A*B;
		produtob = C*D;
		diferença = produtoa-produtob;
		
		System.out.printf("O valor da diferença é %.2f" , diferença);

	}

}
