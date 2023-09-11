package Aula5;

import java.util.Scanner;

public class Exercicioswitch {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 *  Faça uma calculadora. 
O usuário entra com dois números e depois com a operaçao desejada. 
Caso o número da operação seja 1: some os dois números. 
Caso seja 2: subtraia os dois números. 
Caso seja 3: multiplique os dois números. 
Caso seja 4: divida os dois números.
		 */
		System.out.println("Digite 2 numeros");
		double valor1 = entrada.nextDouble();
		double valor2 = entrada.nextDouble();
	
		
		System.out.println("Informe a operação desejada 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão");
		int operacao = entrada.nextInt();
		
		double soma = valor1+valor2;
		double subtracao = valor1-valor2;
		double multiplicacao = valor1*valor2;
		double divisao = valor1/valor2;
		
		switch (operacao) {
		case 1:
			System.out.println("O valor da soma é "+ soma);
			break;
		case 2:
			System.out.println("O valor da subtração é "+ subtracao);
			break;
		case 3:
			System.out.println("O valor da multiplicacao é "+ multiplicacao);
			break;
		case 4:
			System.out.println("O valor da divisao é "+ divisao);
			break;
		default:
			System.out.println("Valor invalido");
			break;
		}
}
}