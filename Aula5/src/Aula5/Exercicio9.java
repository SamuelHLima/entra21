package Aula5;

import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 *  Escreva um algoritmo em que o usuário entra com um número. 
Depois ele escolhe a operação que vai ser feita com esse número 
Caso ele escolha a operação 1 
Modifique a variável do número entrado e some 10 ao número original 
Caso ele escolha a operação 2 
Modifique a variável do número entrado e subtraia 10 do número original 
Caso ele escolha a operação 3 
Modifique a variável do número entrado e multiplique 10 ao número original 
Caso ele escolha a operação 4 
Modifique a variável do número entrado e divida 10 do número original
		 */

		System.out.println("Digite 1 numero");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Informe a operação");
		int operacao=entrada.nextInt();
		
		double operacao1 = 0;
		double variavelAuxiliar=valor1;
		
		switch (operacao) {
		case 1:
			operacao1= variavelAuxiliar+10;	
			System.out.println("O resultado é "+ operacao1);
			break;
		case 2:
			operacao1= variavelAuxiliar-10;	
			System.out.println("O resultado é "+ operacao1);
			break;
		case 3:
			operacao1= variavelAuxiliar*10;	
			System.out.println("O resultado é "+ operacao1);
			break;
		case 4:
			operacao1= variavelAuxiliar/10;	
			System.out.println("O resultado é "+ operacao1);
			break;
		default:
			System.out.println("Valor invalido");
			break;
		}
		
	
	}

}
